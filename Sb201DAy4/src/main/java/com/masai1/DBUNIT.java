package com.masai1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUNIT {

	
	
private static EntityManagerFactory emf;
static {
	emf=Persistence.createEntityManagerFactory("DAY4");
}
public static EntityManager provideconnection() {
	return emf.createEntityManager();
}
	
	
}
