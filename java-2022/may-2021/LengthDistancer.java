import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class LengthDistancer implements distancer<String, Integer>
{
	public LengthDistancer() {
		
		//empty
	}
	
// return absolute difference between an int and length of string
	public int distance(String s, Integer i){
	    if(s == null || i == null)
	        return 0;
	   
	   int distance = 0;
	   distance = Math.abs(s.length() - i);
	        
        return distance;
	}
}
