package com.lamichhane.many.to.many.operation.from.Course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.many.to.many.entity.Course;
import com.lamichhane.many.to.many.entity.Student;




public class ReadCourse {

	public static void main(String[] args) {
		
		//create session factory
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Course.class)
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				
				try {
					
					
					
					
					// start a transaction
				    session.beginTransaction();
								
								
					Course st1 = session.get(Course.class, 42);
					System.out.println(st1);
					System.out.println(st1.getStudents());
					
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
				}
				finally {
					factory.close();
				}

	}

}
