package com.bixterprise.pmes.services;

//import org.springframework.data.domain.Pageable;

import java.util.List;


//import org.springframework.data.domain.Page;

import com.bixterprise.pmes.models.Employe;

public interface IEmployeService {


	public Employe save(Employe e);

	public Employe edit(Employe e);

	public void delete(Employe e);

//	public Page<Employe> list(Pageable pageable);
	
	public List<Employe> list();
	
	public Employe findById(Long id);
	
}
