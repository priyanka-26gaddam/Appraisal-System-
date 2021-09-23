package com.dao;
import java.util.List;
import java.util.Map;

import com.model.Employee;

public interface  EmpDao {
	
	
		 public boolean addEmployee(Employee e);
		 public boolean deleteEmployee(int empid);
		 public List<Employee> getAllEmployee();
		 public boolean updateEmployee(Employee e);
		  Map<String,Integer> getDepartmentWiseCount();
}

