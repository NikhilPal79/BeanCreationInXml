package Nik.learning.__May;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*@SpringBootApplication*/
public class Application {

	public static void main(String[] args) {
		/*SpringApplication.run(Application.class, args);*/


		/*Movie rrr = new Movie(1,"RRR", 2022, "ACTION");*/

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Movie movie = context.getBean("Avengers",Movie.class);
		Movie movie1 = context.getBean("RRR",Movie.class); //// NO USE
		System.out.println(movie);


		/// if you don't provide the bean name in context.getBean then error
	}

}
