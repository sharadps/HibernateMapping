package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@SuppressWarnings("deprecation")
public class HIbernateUtil {

	private static SessionFactory sf = null;

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
		System.out.println("Object of sf :"+sf);
	}

	public static SessionFactory getsf() {
		return sf;
	}
}
