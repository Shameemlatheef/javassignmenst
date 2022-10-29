package com.use;

import com.Dao.EmployeeDAO;
import com.Dao.EmployeeIMPL;
import com.bean.Employee;
import com.excep.Employeeexcep;

public class USECASE {
public static void main(String[] args) throws Employeeexcep {
	EmployeeDAO een=new EmployeeIMPL();
	
//	Employee j=new Employee();
//	j.setName("shameem");
//	j.setSalary(20000);
//	j.setAddress("inchivila");
//	Employee e=een.registerEmployee(j);
//	System.out.println(e.getEmpId());
	
	//System.out.println(een.getEmployeeById(1));
	System.out.println(een.deleteEmployeeById(1));
	
}
}
