package com.agririm.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
		Configuration cfg = new Configuration()
				 .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
				 .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
				 .setProperty("hibernate.connection.username", "postgres")
				 .setProperty("hibernate.connection.password", "postgre")
				 .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/websystique");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
}
