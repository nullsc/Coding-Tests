public class StringHalver implements processor<String, String>
{
/* Create a string of characters only at even positions including 0 */
	public String process(String item){
	    if(item == null || item.length() < 1)
	        return null;
	     
	   String result = "";     
	   for(int i=0; i<item.length(); i++){
	       if(i % 2 == 0)
	            result += item.charAt(i);
	   }
	    return result;
	}
}
