package kaustav.dependdancyInjection;

public class SetterDependable {
    String str;
	
    public void setDependable(String s) {
	   this.str = s;
   }
    
    public String getString() {
    	return str;
    }
}
