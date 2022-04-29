public class still extends waterbody
{
    private boolean fresh;
    private waterbody flow;
    
	public still(String name, boolean fresh) {
	    super(name);
	    this.fresh = fresh;
	}
	
	public String getName(){
	    return super.getName();
	}
	
	@Override
	public boolean hasFresh(){
	    return fresh;
	}
	
	@Override
	public String toString(){
	    return super.getName() + " which is " + (hasFresh() ? "fresh":"not fresh") + " water";
	}
}
