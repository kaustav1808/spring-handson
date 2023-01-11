package kaustav.annotationsetup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoAutoWireClass implements DemoAutoWire {
	@Value("${foo.a}")
	private String a;
	
	@Value("${foo.b}")
	private String b;
	
	@Override
	public String getAutoWired() {
		// TODO Auto-generated method stub
		return this.a+" demo "+this.b;
	}

}
