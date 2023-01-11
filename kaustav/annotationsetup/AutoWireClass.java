package kaustav.annotationsetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutoWireClass {
	@Qualifier("demoAutoWireClassSecond")
	DemoAutoWire autoWire;
	
	@Autowired
	public AutoWireClass(@Qualifier("demoAutoWireClassSecond") DemoAutoWire autoWire ) {
		this.autoWire = autoWire;
	}
	
	public String getMainClass() {
		 return "This is from AutoWireClass";   
	}
	
	public String getFromAutoWiredClass() {
		return this.autoWire.getAutoWired();
	}
	   
}
