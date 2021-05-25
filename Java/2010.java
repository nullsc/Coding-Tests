/******************************************************************************


*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	}
	
	public static int groupcalc(int num){
	    int rate = 0;
	    if(num < 12){
	        rate=5;
	    } else if(num > 12 && num < 20){
	        rate=4;
	    } else if(num > 20){
	        rate=3;
	    } 
	    return num * rate;
	}
}
