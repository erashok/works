package com.delhimetro.dao.util;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

/**
 * @author ashok yadav
 */
public class HibernateUtil {
		private static final SessionFactory sessionFactory;
		static {
			try {				
				sessionFactory = new Configuration().configure().buildSessionFactory();				
			}catch (Throwable ex) {

				System.out.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
			}
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}
	}


