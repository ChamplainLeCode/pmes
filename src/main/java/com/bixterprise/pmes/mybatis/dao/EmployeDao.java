package com.bixterprise.pmes.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.bixterprise.pmes.models.Employe;

@Repository
@Mapper
public interface EmployeDao {

	List<Employe> list();

	void save(Employe e);
}
