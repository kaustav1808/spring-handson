package kaustav.annotationsetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Setterinjection {
	@Qualifier("demoAutoWireClassSecond")
	DemoAutoWire autoWire;
	
    @Autowired
	public void setAutoWire(@Qualifier("demoAutoWireClassSecond") DemoAutoWire autoWire) {
		this.autoWire = autoWire;
	}
    
	public String getMainClass() {
		 return "This is from Setterinjection";   
	}
	
	public String getFromAutoWiredClass() {
		return this.autoWire.getAutoWired();
	}
}
