/*
Task to count the consecutive occurences of characters in an array
*/

public class Main
{
	public static void main(String[] args) {
        
      String[] v = {"a", "b", "e", "e", "c", "a", "a", "a"};
      printRuns(v);
    // prints a 1 b 1 e 2 c 1 a 3                                                  
	}	
public static void printRuns(String[] v){

	    int count = 1;
	    String retstr = "";
	    
	    for (int i=0; i<v.length-1; i++){
	        //System.out.println(v[i]);
	        if(v[i].equals(v[i+1])){ //next value is the same
	            count++;
	   
	        } else { //different value
	            retstr += v[i] + " " + count + " ";
	            //System.out.println(v[i] + count);
	            count = 1;
	        }
	    }
	    retstr += v[v.length-1] + " " + count + " "; //get the last value
	    System.out.println(retstr); 
	    
	
	}
	
	public static String reverse(String str){ //reverse string
	    
	    String ret = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            //System.out.print(str.charAt(i));
            ret += str.charAt(i);
        }
        
        return ret;
	}
}
