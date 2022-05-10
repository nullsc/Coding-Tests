public interface HasName extends Comparable<HasName> {
    String getName();
    
    default int compareTo(HasName other){
        if(!(other instanceof HasName))
            return -1;
            
        other = (HasName)other;
        return this.getName().compareTo(other.getName());
    }
    
    static String getGreatest(HasName[] hans){
        if(hans == null || hans.length == 0){
            return null;
        }
        
        HasName greatest = null;
        for(HasName i: hans){
            if(i.compareTo(greatest) > 0){
                greatest = i;
            }
        }
        //return greatest == null ? null : greatest.getName();
        return "" + greatest;
    }
} 
/*
String result = null;
for (HasName h : hans)
if (h != null)
if (result == null || result.compareTo(h) < 0)
result = h;
return result;
*/
