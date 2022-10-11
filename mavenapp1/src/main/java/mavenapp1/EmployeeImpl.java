package mavenapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeImpl implements EmployeeDAO {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("accUnit");
	
	
	
	@Override
	public void save(Employee emp) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
		
		System.out.println("Employee saved");
		em.close();
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		EntityManager em1=emf.createEntityManager();
		Employee emplo=em1.find(Employee.class, empId);
		String add=emplo.getAddress();
		em1.close();
		return add;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		EntityManager em2=emf.createEntityManager();
		String message=null;
		Employee empo=em2.find(Employee.class, empId);
		if(empo!=null) {
			EntityTransaction et1=em2.getTransaction();
			et1.begin();
			empo.setSalary(empo.getSalary()+bonus);
			et1.commit();
			message="updated";
			em2.close();
		}
		else {
		 message="not updated";
		}
		
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManager em3=emf.createEntityManager();
		Employee ee=em3.find(Employee.class, empId);
		if(ee!= null) {
			EntityTransaction et3=em3.getTransaction();
			et3.begin();
			em3.remove(ee);
			et3.commit();
			em3.close();
		
		//em3.detach(ee);
		return true;
		
		}
		else
		return false;
	}

}
