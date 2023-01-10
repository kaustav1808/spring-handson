package kaustav.annotationsetup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		DemoClass demo = context.getBean("demoClass", DemoClass.class);
		
		demo.show();
		
		context.close();

	}

}
