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
}
