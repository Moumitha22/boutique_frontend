package com.moumitha.flowerboutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.moumitha.flowerboutique.entity.Boutique;

public interface BoutiqueRepository extends JpaRepository<Boutique,Integer> {

	@Modifying
	@Transactional
	@Query("update Boutique b set b.available = b.available + ?1 where b.id in ?2")
    int increaseAvailableById(int increment,int id);
	
	@Modifying
	@Transactional
	@Query("update Boutique b set b.available = b.available - ?1 where b.id in ?2")
	int decreaseAvailableById(int decrement,int id);
	
	@Modifying
	@Transactional
	@Query("update Boutique b set b.price = b.price + ?1 where b.id in ?2")
	int increasePriceById(int increment,int id);
	
	@Modifying
	@Transactional
	@Query("update Boutique b set b.price = b.price - ?1 where b.id in ?2")
	int decreasePriceById(int decrement,int id);
	
	@Modifying
	@Transactional
    @Query("delete from Boutique b where b.id = :flowerId")
    int deleteFlowerById(@Param("flowerId") int id);
}
