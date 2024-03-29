/******************************************************************************


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] a = {
		    {2,3,3},
		    {1,3},
		    {1,2}
		};
		sumr(a);
		
		Student[] Students = new Student[2];
		Students[0] = new Student(0);
		Students[1] = new Student(1);
		for(Student x: Students){
		    System.out.println(x.ID);
		}
		int[] gf = {2, 0, 2};
		int[] ga = {1, 2, 2};
		difference(gf, ga);
		
		int[] n = {1,2,3,4,5,9,7,8,9,9};
		duplicate(n);
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
	    
	    for(int x =0; x<ret.length; x++){
	        for(int z=0; z<ret[x].length; z++){
	            System.out.print(ret[x][z]);
	        }
	        System.out.println();
	    }
	    return ret;
	}
	
	public static int[] difference(int[] goalsFor, int[] goalsAgainst){
	    if(goalsFor.length != goalsAgainst.length)
	       return null;
    
	    int[] ret = new int[goalsFor.length];
	    for(int i=0; i<goalsFor.length; i++){
	        ret[i] = goalsFor[i] - goalsAgainst[i];
	        System.out.print(ret[i] + " ");
	    }
    System.out.println();
	    return ret;
	}
	
	public static int getGoalDifference(int[] gfor, int[] gagain){
	    int[] sumarray = new int[gfor.length];
	    int ret = 0;
	    sumarray = difference(gfor, gagain);
	    if(sumarray == null)
	        return -999;
	        
	    for(int i: sumarray){
	        ret += i;
	        System.out.println("Return sum: " + ret);
	    }
	    
	    return ret;
	}
	
	public static void printSubstrings(String word){
	    String ret = "";
	    String buf = "";
	    for(int i=0; i<word.length()/2; i++){
	        ret = word.substring(i, word.length()-i);
	        for(int j=0; j<i; j++){
	            //System.out.print(" ");
	            buf += " "; // x for debug
	        }
	        System.out.println(buf + ret + buf);
	        buf = ""; //reset
	            
	        
	    }
	}
	
	public static boolean duplicate(int[] arr){ /*finds if there is a duplicate in an array*/
	    for(int i=0; i<arr.length -1; i++){
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[i] == arr[j]){
	                System.out.println("Duplicate found: " + arr[i] + " & " + arr[j]);
	                return true;
	            }
	        }
	    }
	    return false;
	}
}
