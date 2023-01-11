package kaustav.annotationsetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
	@Autowired
	@Qualifier("demoAutoWireClassSecond")
	DemoAutoWire autoWire;
	
    
	public String getMainClass() {
		 return "This is from FieldInjection";   
	}
	
	public String getFromAutoWiredClass() {
		return this.autoWire.getAutoWired();
	}
}
