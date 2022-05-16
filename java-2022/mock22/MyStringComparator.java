import java.util.Comparator;

public class MyStringComparator implements Comparator<String>
{
	public int compare(String o1, String o2){
	    if(o1 == null && o2 == null)
	        return 0;
	        
	    if(o1 != null && o2 == null)
	        return 1;
	    if(o1 == null && o2 != null)
	        return -1;
	        
	    if(o1.length() > o2.length())
	        return 1;
	        
	    if(o2.length() > o1.length())
	        return -1;
	        

	        
	   return o1.compareTo(o2);
	}
}
