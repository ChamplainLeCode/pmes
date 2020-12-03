package com.bixterprise.pmes.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bixterprise.pmes.models.Employe;

@Mapper
public interface EmployeMapper {

	@Select("select * from employees")
    public List<Employe> findAll();

    @Select("SELECT * FROM employees WHERE id = #{id}")
    public Employe findById(long id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int deleteById(long id);
    
    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int delete(Employe employee);

    @Insert("INSERT INTO employees(id, name, surname, function) " +
        " VALUES (#{id}, #{name}, #{surname}, #{function})")
    public int save(Employe employee);

    @Update("Update employees set name=#{name}, " +
        " surname=#{surname}, function=#{function} where id=#{id}")
    public int edit(Employe employee);
    
    
}
