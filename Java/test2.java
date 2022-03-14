/******************************************************************************


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] ar = {1,2,3,5};
		System.out.println(cont(5, ar));
	}
	
  /* Test if an int arrary contains a specified int */
	public static boolean cont(int t, int[] nums) {
	    for(int num: nums) {
	        if(num == t)
	            return true;
	    }
	    return false;
	}
	
	public static boolean palin(String str) {
	    System.out.println(str);
	    if (str.length() < 2)
	        return true;
	        
        if(str.charAt(0) == str.charAt(str.length()-1))
            return palin(str.substring(1, str.length()-1));
        
	    return false;
	}
}
