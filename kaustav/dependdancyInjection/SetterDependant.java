package kaustav.dependdancyInjection;

public class SetterDependant {
	SetterDependable dep;
    public void setDependant(SetterDependable d) {
  	  this.dep = d;
    }
    
    public String whatIsThis() {
    	return "This is the dependant class.";
    }
    
    public String whatIsTheDependable() {
    	return this.dep.getString();
    }
}
