package kaustav.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Test t1 = context.getBean("test", Test.class);
		
		Test t2 = context.getBean("test", Test.class);
		
		System.out.println("both bean t1 and t2 are same: "+ (t1==t2));
		
		System.out.println("memory location of t1 is: "+ t1);
		
		System.out.println("memory location of t2 is: "+ t2);
		
        Test2 t3 = context.getBean("test2", Test2.class);
		
		Test2 t4 = context.getBean("test2", Test2.class);
		
		System.out.println("both bean t3 and t4 are same: "+ (t3==t4));
		
		System.out.println("memory location of t1 is: "+ t3);
		
		System.out.println("memory location of t2 is: "+ t4);

	}

}
