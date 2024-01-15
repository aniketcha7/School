package com.Arc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arc.entity.Student_info;
import com.Arc.repository.Studentrepo;

@RestController
public class Studentoperations {

	@Autowired
	private Studentrepo repo;
	
	@PostMapping("/saveinfo")
	public Student_info info(@RequestBody Student_info theStudent_info) {
		
		return repo.save(theStudent_info);
		
	}
	
	@PostMapping("path/{first}/{last}/{std}/{stream}")
	public String studentdata(@PathVariable("first") String thefirst,
			@PathVariable("last") String thelast,
			@PathVariable("std") String thestd,
			@PathVariable("stream") String thestream) {
		
		Student_info ob = new Student_info();
		ob.setFirst(thefirst);
		ob.setLast(thelast);
		ob.setStd(thestd);
		ob.setStream(thestream);
		
		repo.save(ob);
		
		return "Data Saved Succesfully";
	}
	@DeleteMapping("/{id}")
	public String deletestud(@PathVariable("id") Integer theid) {
		
		repo.deleteById(theid);
		
		return "Deleted successfully";
	}
	
	
	@PutMapping("/update")
	public Student_info updatedata(@RequestBody Student_info theInfo) {
		
		return repo.save(theInfo);
	}
	
	@GetMapping("/studdata")
	public List<Student_info> studdata(){
		
		return repo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
