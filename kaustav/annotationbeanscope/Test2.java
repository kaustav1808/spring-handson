package kaustav.annotationbeanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Test2 {
	public Test2() {
		System.out.println("Constructing test2 class");
	}
}
