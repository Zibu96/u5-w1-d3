package giovannighirardelli.u5_w1_d3;

import giovannighirardelli.u5_w1_d3.entities.Drinks;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
class U5W1D3ApplicationTests {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D3Application.class);
	Drinks drink1= (Drinks) context.getBean("drink1");
	Drinks drink2= (Drinks) context.getBean("drink2");
	Drinks drink3= (Drinks) context.getBean("drink3");
	Drinks drink4= (Drinks) context.getBean("drink4");
	Drinks drink5= (Drinks) context.getBean("drink5");
	@Test
	void testDrinkPrices() {
				System.out.println("Test prezzi drinks");
		double result = drink1.getPrezzo() + drink2.getPrezzo() + drink3.getPrezzo() + drink4.getPrezzo() + drink5.getPrezzo();
		assertEquals(25.1, result);
	}


	@Test
	void testDrinkExist(){
		System.out.println("Test se drink esiste");
		assertNotNull(drink1);
	}


}
