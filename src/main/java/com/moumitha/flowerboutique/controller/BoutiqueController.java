package com.moumitha.flowerboutique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moumitha.flowerboutique.entity.Boutique;
import com.moumitha.flowerboutique.service.BoutiqueService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class BoutiqueController {
	@Autowired
	private BoutiqueService btqService;
	
	@PostMapping("/addFlower")
	public String insertFlower(@RequestBody Boutique flower) {
	   btqService.saveFlower(flower);
	   return "Flower Added";
	}
	
	@GetMapping("/getFlowers")
	public List<Boutique> readAllFlowers(){
		return btqService.getAllFlowers();
	}
	
	@GetMapping("/getFlower/{id}")
	public Boutique readFlowerById(@PathVariable int id) {		
		return btqService.getFlowerById(id);
	}
	
	@PutMapping("/updateFlower/{id}")
	public Boutique updateFlower(@PathVariable int id,@RequestBody Boutique flower) {
		return btqService.updateFlower(id,flower);
	}
	
	@PutMapping("increaseAvailable/{val}/{id}")
    public String increaseAvailabaleById(@PathVariable int val,@PathVariable int id){ 
		int numOfFlowers = btqService.increaseAvailabaleById(val,id);
    	return numOfFlowers + " updated successfully";
    }
	
	@PutMapping("decreaseAvailable/{val}/{id}")
	public String decreaseAvailabaleById(@PathVariable int val,@PathVariable int id){ 
		int numOfFlowers = btqService.decreaseAvailabaleById(val,id);
		return numOfFlowers + " updated successfully";
	}
	
	@PutMapping("increasePrice/{val}/{id}")
	public String increasePriceById(@PathVariable int val,@PathVariable int id){ 
		int numOfFlowers = btqService.increasePriceById(val,id);
		return numOfFlowers + " updated successfully";
	}
	
	@PutMapping("decreasePrice/{val}/{id}")
	public String decreasePriceById(@PathVariable int val,@PathVariable int id){ 
		int numOfFlowers = btqService.decreasePriceById(val,id);
		return numOfFlowers + " updated successfully";
	}
	
		
	@DeleteMapping("/delete/{id}")
	public String deleteFlowerById(@PathVariable int id){ 
	   	return  btqService.deleteFlowerById(id) + " deleted succesfully";
	}

}
