package com.lamichhane.many.to.many.opration.from.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.many.to.many.entity.Course;
import com.lamichhane.many.to.many.entity.Student;




public class DeleteStudent {

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
				    
				    Student st = session.get(Student.class, 45);
								
								
				    session.delete(st);
					
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
				}
				finally {
					factory.close();
				}

	}

}
