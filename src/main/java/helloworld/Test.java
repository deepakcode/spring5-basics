package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan(basePackages = "helloworld")
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

		B3 b3 = (B3) context.getBean("b3");

		// greeting.setMessage("Hello Wrold!!!");
		
		B4 b4= (B4)b3.getI4();

		System.out.println(b4.getX());
		System.out.println(b4.getY());
		
		B5 b5= (B5)b3.getI5();
		
		System.out.println(b5.getX());
		System.out.println(b5.getY());
		
	}

}
