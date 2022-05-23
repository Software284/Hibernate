package com.lamichhane.relation.hold.by.instructor_detail.example.read.delete.insert.from.instructor_detail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.one.to.one.entity.Instructor;
import com.lamichhane.one.to.one.entity.InstructorDetail;

public class InsertFromInstructorDetail {

	public static void main(String[] args) {
		
		//create session factory
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				
				try {
					// create the objects
					InstructorDetail tempInstructorDetail1 = new InstructorDetail("http://www.luv2code.com/youtube","Luv 2 code!!!");
		            Instructor ins = new Instructor("Nabin","Sharma","nabin@gmail.com");
		            tempInstructorDetail1.setInstructor(ins);
					
					// start a transaction
				    session.beginTransaction();
								
								
					//save the instructor
					session.save(tempInstructorDetail1);
					
					
					
					
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
				}
				finally {
					factory.close();
				}

	}

}
