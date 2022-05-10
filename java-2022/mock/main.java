//
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		StringHalver halver = new StringHalver();
        System.out.println( halver.process("Birkbeck") );
        System.out.println( halver.process("BBBKK") );
	}
	/* works
	public static double printAllReports(Person[] persons){
	    if(persons == null)
	        throw new IllegalArgumentException();
	        
	   for(Person p: persons){
	       if(p instanceof HasReports){ // apply to interface to see if person is a manager
	           HasReports h = (HasReports)p; // cast
	            h.PrintReports();
	       }
	   }
	   return 0;
	}*/
}
