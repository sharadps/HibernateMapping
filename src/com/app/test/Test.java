package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student;
import com.app.util.HIbernateUtil;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		Student s = new Student();
		s.setStudId(11);
		s.setStudName("sharad");
		s.setStudEmail("vadarsharad@gmail.com");
		s.setStudBranch("computer");
		s.getCourse().add("java");
		s.getCourse().add("spring");
		s.getCourse().add("hibernate");
		
		ses.save(s);
		tx.commit();
		ses.close();

	}

}
