package com.moumitha.flowerboutique.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moumitha.flowerboutique.entity.Boutique;
import com.moumitha.flowerboutique.repository.BoutiqueRepository;

@Service
public class BoutiqueService {
	@Autowired
	private BoutiqueRepository btqRepo;
	
//	POST
	public Boutique saveFlower(Boutique flower) {
		return btqRepo.save(flower);
	}
	
//	GET 
	public List<Boutique> getAllFlowers(){
		return btqRepo.findAll();	
	}
	
//	GET BY ID
	public Boutique getFlowerById(int id) {
		return btqRepo.findById(id).orElse(null);
	}
		
//	PUT
	public Boutique updateFlower(int id,Boutique flower) {
//		flower.setId(id);
		return btqRepo.saveAndFlush(flower);
	}
	
//	INCREASE AVAILABLE
    public int increaseAvailabaleById(int val,int id) {
    	return btqRepo.increaseAvailableById(val,id);
    }
    
//	DECREASE AVAILABLE
    public int decreaseAvailabaleById(int val,int id) {
    	return btqRepo.decreaseAvailableById(val,id);
    }
	
//	INCREASE PRICE
    public int increasePriceById(int val,int id) {
    	return btqRepo.increasePriceById(val,id);
    }
    
//	DECREASE PRICE
    public int decreasePriceById(int val,int id) {
    	return btqRepo.decreasePriceById(val,id);
    }
    
	
//	DELETE BY ID
    public int deleteFlowerById(int id) {
    	return btqRepo.deleteFlowerById(id);
    }
	

}
