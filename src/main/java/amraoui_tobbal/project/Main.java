package amraoui_tobbal.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		try{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("json_to_db.xml");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
 