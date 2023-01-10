package kaustav.dependdancyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Dependant depend = context.getBean("dependant", Dependant.class);
		
		System.out.println(depend.whatIsthis());
		
		System.out.println(depend.whatIsTheDependable());
		
		context.close();

	}

}
