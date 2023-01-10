package kaustav.dependdancyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
        SetterDependant depend = context.getBean("SetterDependant", SetterDependant.class);
		
		System.out.println(depend.whatIsThis());
		
		System.out.println(depend.whatIsTheDependable());
		
		context.close();

	}

}
