package com.bixterprise.pmes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bixterprise.pmes.models.Employe;
import com.bixterprise.pmes.services.impl.EmployeService;

@RestController
@RequestMapping("/services/employes") 
public class EmployeRestController {

	@Autowired EmployeService service;

	@GetMapping("/list")
	public List<Employe> getAll(){
		Employe e = new Employe();
		e.setName("Bakop Njoba");
		e.setSurname("Champlain Marius");
		e.setFunction("Software Developer");
		service.save(e);
		return service.list();
	}
//	@GetMapping("/list")
//	public List<Employe> getAll(Pageable pageable){
//		
//		
//		return service.list(pageable).getContent();
//	}
//	
	@PostMapping
	public Employe save(@RequestBody Employe e){
		
		
		return service.save(e);
	}
	
	@PutMapping
	public Employe edit(@RequestBody Employe e){
		
		
		return service.edit(e);
	}
	
	@DeleteMapping
	public Boolean delete(@RequestBody Employe e){
		
		service.delete(e);
		return true;
	}
	
	
}
