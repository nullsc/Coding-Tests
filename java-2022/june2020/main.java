//
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		MaxCounter mc = new MaxCounter();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
        mc.reset();
        System.out.println(mc);
        mc.click();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
        
        LongStringFilter f = new LongStringFilter(4);
        ArrayList<String> a = new ArrayList<>();
        a.add("Mary");
        a.add("had");
        a.add("a");
        a.add("little");
        a.add("lamb");
        int n = f.countAccepted(a);
        System.out.println("Accepted: " + n);
        
        getInput();

	}
	
  // keep taking int inputs, prints of number is > than the previous
	public static void getInput(){
	    int first = 0;
	    int second = 0;
	    
    	Scanner sc = new Scanner(System.in);  // Create a Scanner object
    	while(true){ // can use sc.hasNext()
            System.out.println("Enter a number");
            if(sc.hasNextInt()){
                first = sc.nextInt();
                if(first == 0)
                    return;
                
                if(second != 0){ // check if value has changed
                    if(first > second){
                        System.out.println("Bigger");
                    } else if(first < second){
                        System.out.println("Smaller");
                    } else{
                        System.out.println("Same");
                    }
                }
                    
                second = first;
                    
            } else {
                throw new WeirdInputException();
            }
    	}

	}
}
