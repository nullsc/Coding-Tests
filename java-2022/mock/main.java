//
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception { // needed
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
	
	public static void getDoub() throws BadInputException { // checked exception
		System.out.println("Enter Double: ");
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextDouble()){
		    double doub=sc.nextDouble();

		    System.out.println("You entered: " + doub);
		} else {
		    throw new BadInputException();
		}
	}
	
	/* recursive string appending */
	public static String multiplyRecursive(String s, int n){
	    if(s == null)
	        throw new IllegalArgumentException();
	   
	   
	   if(n == 1)
	        return s;
	        
	   return s + multiplyRecursive(s, n-1);
	    
	}
}
