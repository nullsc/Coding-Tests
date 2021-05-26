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
	
	public static void change4(int[] num){
	    int count = 0;
	    for(int i=0; i<num.length; i++){
	        if(num[i] == 4){
	            num[i] = 5;
	            count++;
	        }
	    }
	    for(int j: num){
	        System.out.print(j + " ");
	    }
	    System.out.println("\nChanges: " + count);
	}
	
	public static double[] rif(double[] num){
	    double[] newa = new double[num.length];
	    newa[0] = num[0];
	    for(int i=1; i<num.length; i++){
	        newa[i] = num[i] / num[0];
	    }
	    for(double x: newa){
	        System.out.print(x + " ");
	    }
	    return newa;
	}
}
