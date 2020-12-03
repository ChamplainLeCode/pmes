package com.bixterprise.pmes.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

//import com.bixterprise.pmes.dao.EmployeRepository;
import com.bixterprise.pmes.models.Employe;
import com.bixterprise.pmes.mybatis.dao.EmployeDao;
import com.bixterprise.pmes.mybatis.mappers.EmployeMapper;
import com.bixterprise.pmes.services.IEmployeService;

@Service
public class EmployeService implements IEmployeService{

//	@Autowired EmployeRepository dao;
	
	@Autowired EmployeMapper mapper;
	@Autowired EmployeDao dao;
	
	@Override
	public Employe save(Employe e) {
		dao.save(e);
		return e;
	}

	@Override
	public Employe edit(Employe e) {
		
		mapper.edit(e);
		return e;
	}

	@Override
	public void delete(Employe e) {
		
		mapper.delete(e);
	}

//	@Override
//	public Page<Employe> list(Pageable pageable) {
//		return dao.findAll(pageable);
//	}

	public List<Employe> list(){
		return dao.list();
	}

	public Employe findById(Long id) {
		return mapper.findById(id);
	}
	
	
}
