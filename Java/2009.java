/******************************************************************************


*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("2009 practise");
		
		System.out.println(interest(1, 1000));
		System.out.print(reverse("123456"));
		get100();
		
	
	public static float interest(int p, int invest) {
	    double rate;
	    if(invest <= 1000){
	        rate = 2.0;
	    } else {
	        rate = 3.5;
	    }
		
		return (float)(invest * (rate/100)) * p + invest;
	}
	
	public static String reverse(String str){
	    
	    String ret = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            //System.out.print(str.charAt(i));
            ret += str.charAt(i);
        }
        
        return ret;
	}


	public static void get100(){
	    int total = 0;
	    int times = 0;
	    Scanner getint = new Scanner(System.in);
	    while(total < 100){
    		System.out.println("Please enter number: ");
    		int num = getint.nextInt();
    		total += num;
    		times++;
	    }
	    System.out.println("Total reached: " + total + " Times: " + times);
		
	}
}
