package kaustav.annotationsetup;

import org.springframework.stereotype.Component;

@Component
public class DemoClass implements DemoInterface {
	
	public void show() {
		System.out.println("Hello there! it's working ");
	}

}
