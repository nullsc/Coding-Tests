public abstract class waterbody
{
    private String name;
    
	public waterbody(String name) {
		this.name = name;
		
	}
	
	
	public String getName(){
	    if(this.name != null)
	        return this.name;
	   return "";
	}
	
	public abstract boolean hasFresh();
	
	@Override
	public String toString(){
	    return name;
	}
}
