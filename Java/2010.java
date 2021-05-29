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
	public static void stv(String stv){ //print out 3 letter substrings that end in a
	    if(stv.length() < 3){
	        return;
	    }
	    for(int i=0; i<stv.length()-2; i++){
	        if(stv.charAt(i+2) == 'a'){
	            System.out.println(stv.substring(i, i+3));
	        }
	    }
	}
	
	public static int[][] sumr(int[][] v){
	    int[][] ret = new int[2][v.length];
	    int total;
	    for(int i=0; i<v.length; i++){
	        total = 0;
	        for(int j=0; j<v[i].length; j++){
	            total += v[i][j];
	        }
	        ret[0][i] = total;
	    }
	    ret[1] = v[0];
	    
	    for(int x =0; x<ret.length; x++){ //debug
	        for(int z=0; z<ret[x].length; z++){
	            System.out.print(ret[x][z]);
	        }
	        System.out.println();
	    }
	    return ret;
	}
}
