package com.kraft.util;

import jakarta.persistence.*;

public class JPAUtil {
	
	private static EntityManagerFactory  factory;
    private static final String PERSISTENCE_UNIT_NAME = "JpaCrudOrnek";
    
	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	
	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

}
