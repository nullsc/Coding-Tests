/******************************************************************************

*******************************************************************************/
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
        
        //getInput();
        Tree t = Tree.create(2);
        
        int[] values = { 1, 2, 3, 4, 5, 6 };
        boolean allCopied = t.fill(values);
        
        System.out.println(toPalindromeRecursive("test"));
        //System.out.println(toPalindromeRecursive2("test", 3));

	}
	
	
	public static void getInput(){
	    int first = 0;
	    int second = 0;
	    
    	Scanner sc = new Scanner(System.in);  // Create a Scanner object
    	while(true){
            System.out.println("Enter a number");
            if(sc.hasNextInt()){
                first = sc.nextInt();
                if(first == 0)
                    return;
                
                if(second != 0){
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
	
	/* test = testtset*/
	public static String toPalindromeRecursive(String s){
	    if (s == null)
            throw new IllegalArgumentException();
            
	    if(s.length() == 0)
	        return "";
	        
	   //System.out.println(s);
	   
	    return s.charAt(0) + toPalindromeRecursive(s.substring(1)) + s.charAt(0);
	}
	
	public static String toPalindromeRecursive2(String s, int pos){ // not working
	    if(pos == 0)
	        return s;
	        
	    if(s.length() <= 1)
	        return s.charAt(0) + s;
	        
	    return toPalindromeRecursive2(s, pos-1) + s.charAt(pos);
	}
}
