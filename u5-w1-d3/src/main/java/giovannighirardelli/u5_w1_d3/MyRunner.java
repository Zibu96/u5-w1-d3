package giovannighirardelli.u5_w1_d3;


import giovannighirardelli.u5_w1_d3.entities.Menu;
import giovannighirardelli.u5_w1_d3.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Ordine ordine;
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D3Application.class);

        System.out.println("CIAO DAL RUNNER");
        Menu menu =(Menu) context.getBean("menu");
        menu.printMenu();

        System.out.println(ordine);



    }
}