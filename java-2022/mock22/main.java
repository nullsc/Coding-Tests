//
/******************************************************************************

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		MyStringComparator cmp = new MyStringComparator();
		
		System.out.println(cmp.compare("bb", null));
        System.out.println(cmp.compare("bb", "a"));
        System.out.println(cmp.compare("bb", "aa"));
        System.out.println(cmp.compare("bb", "bb"));
        System.out.println(cmp.compare(null, null)); 
        System.out.println(cmp.compare("bb", "aaa"));
        System.out.println(cmp.compare("bb", "ccc"));
        System.out.println(cmp.compare(null, ""));
        
        /* calculate the sum or all ints in arg */
        int total = 0;
        for(String i: args){
            Scanner sc = new Scanner(i);
            while(sc.hasNext()){
                if(sc.hasNextInt()){
                    total += sc.nextInt();
                } else {
                    sc.next();
                }
            }
            
        }
        System.out.println("Total: " + total);
      
	}
	
	public static int sumRecursive(int[] numbers){ // not finished
	    if(numbers.length == 0)
	        return;
	    
	    
	    return sumRecursive();
	    
	}
}
