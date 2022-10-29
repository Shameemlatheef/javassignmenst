package com.Dao;

import com.bean.Employee;
import com.excep.Employeeexcep;

public interface EmployeeDAO {
	public Employee registerEmployee(Employee employee)throws Employeeexcep;
	
	public Employee getEmployeeById(int empId)throws Employeeexcep;
	public Employee deleteEmployeeById(int empId) throws Employeeexcep;
	public Employee updateEmployee(Employee employee)throws Employeeexcep;
	

}
