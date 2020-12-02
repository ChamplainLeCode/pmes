package com.bixterprise.pmes.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bixterprise.pmes.dao.EmployeRepository;
import com.bixterprise.pmes.models.Employe;
import com.bixterprise.pmes.services.IEmployeService;

@Service
public class EmployeService implements IEmployeService{

	@Autowired EmployeRepository dao;
	
	
	@Override
	public Employe save(Employe e) {

		return dao.save(e);
	}

	@Override
	public Employe edit(Employe e) {
		
		return dao.save(e);
	}

	@Override
	public void delete(Employe e) {
		
		dao.delete(e);
	}

	@Override
	public Page<Employe> list(Pageable pageable) {
		return dao.findAll(pageable);
	}

	
	
}
