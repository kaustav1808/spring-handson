package kaustav.annotationbeanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Test1 {
	public Test1() {
		System.out.println("Constructing test1 class");
	}

}
