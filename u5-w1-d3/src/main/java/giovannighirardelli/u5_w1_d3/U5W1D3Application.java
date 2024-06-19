package giovannighirardelli.u5_w1_d3;

import giovannighirardelli.u5_w1_d3.entities.Drinks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D3Application.class);

		SpringApplication.run(U5W1D3Application.class, args);

		Drinks drink1= (Drinks) context.getBean("drink1");
		System.out.println(drink1);

	}

}
