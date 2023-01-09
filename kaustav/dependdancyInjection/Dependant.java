package kaustav.dependdancyInjection;

public class Dependant {
     private Dependable dependable;
    
    public Dependant(Dependable d) {
    	dependable = d;
    }
    
    public String whatIsthis() {
    	return "This is dependant class.";
    }
    
    public String whatIsTheDependable() {
    	return dependable.d;
    }
}
