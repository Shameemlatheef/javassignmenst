package com.Dao;

import javax.persistence.EntityManager;

import com.bean.Employee;
import com.excep.Employeeexcep;
import com.masai1.DBUNIT;

public class EmployeeIMPL implements EmployeeDAO{

	@Override
	public Employee registerEmployee(Employee employee) throws Employeeexcep {
		EntityManager em=DBUNIT.provideconnection();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		
		int id=employee.getEmpId();
		
		Employee empo=em.find(Employee.class, id);
		em.close();
		return empo;
		
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws Employeeexcep {
		EntityManager em=DBUNIT.provideconnection();
		Employee ey=em.find(Employee.class,empId);
		return ey;
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws Employeeexcep {
		EntityManager em=DBUNIT.provideconnection();
		Employee empp=em.find(Employee.class, empId);
		
		em.getTransaction().begin();
		em.remove(empp);
		em.getTransaction().commit();
		return empp;
		//return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Employeeexcep {
		// TODO Auto-generated method stub
		return null;
	}

}
