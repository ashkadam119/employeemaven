package com.capstone.project.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capstone.project.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long> {

		
	}

	
}
