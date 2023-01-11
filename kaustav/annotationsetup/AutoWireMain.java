package kaustav.annotationsetup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
        AutoWireClass demo = context.getBean("autoWireClass", AutoWireClass.class);
		
		System.out.println(demo.getMainClass());
		
		System.out.println(demo.getFromAutoWiredClass());
		
		Setterinjection demo2 = context.getBean("setterinjection", Setterinjection.class);
		
		System.out.println(demo2.getMainClass());
		
		System.out.println(demo2.getFromAutoWiredClass());
		
		FieldInjection demo3 = context.getBean("fieldInjection", FieldInjection.class);
		
		System.out.println(demo3.getMainClass());
		
		System.out.println(demo3.getFromAutoWiredClass());
		
		context.close();

	}

}
