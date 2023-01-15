package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("routing.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("aggragate.xml");


		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("database.xml");

		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");*/



		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("webServiceCalling.xml");

		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");*/



		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("database.xml");

		// Add a person
		Person person = new Person();
		person.setName("John");
		person.setId(1);

		System.out.println(person);*/


	}

}
 