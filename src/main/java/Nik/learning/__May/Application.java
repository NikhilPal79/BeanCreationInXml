package Nik.learning.__May;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


		/*Movie rrr = new Movie(1,"RRR", 2022, "ACTION");*/

		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		///SHOWCASE OF DESTROY METHOD
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Movie movie = context.getBean("Avengers",Movie.class);
		Movie movie1 = context.getBean("RRR",Movie.class);
		Movie movie2 = context.getBean("HP",Movie.class);
		System.out.println(movie);
		System.out.println(movie1);
		System.out.println(movie2);
		context.registerShutdownHook();


		/// if you have two beans in the xml file, then if you don't provide the bean name in context.getBean then error



	}

}
