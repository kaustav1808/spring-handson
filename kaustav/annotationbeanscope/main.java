package kaustav.annotationbeanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationbeanscope-applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Test1 t1 = context.getBean("test1", Test1.class);
		
		Test1 t2 = context.getBean("test1", Test1.class);
		
		System.out.println("both bean t1 and t2 are same: "+ (t1==t2));
		
		System.out.println("memory location of t1 is: "+ t1);
		
		System.out.println("memory location of t2 is: "+ t2);
		
        Test2 t3 = context.getBean("test2", Test2.class);
		
		Test2 t4 = context.getBean("test2", Test2.class);
		
		System.out.println("both bean t3 and t4 are same: "+ (t3==t4));
		
		System.out.println("memory location of t1 is: "+ t3);
		
		System.out.println("memory location of t2 is: "+ t4);
		
		Test2 t5 = context.getBean("annotedBean", Test2.class); 

		context.close();

	}

}
