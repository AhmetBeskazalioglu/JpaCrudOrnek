package com.kraft.operations;

import com.kraft.entities.Student;
import com.kraft.util.JPAUtil;
import jakarta.persistence.*;

public class CrudOperations {

	public void insertEntity() {
		
		try {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
	    // Insert operation
		Student student = new Student("Ahmet","Beşkazalıoğlu","ahmetbeskazalioglu@gmail.com");
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	} catch (Exception e) {
		System.err.println("Error: insertEntity() " + e);
	}
	}
}
