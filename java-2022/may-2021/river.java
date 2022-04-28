public class river extends waterbody
{
    private boolean fresh;
    private waterbody flow;
    
	public river(String name, waterbody flow) {
		super(name);
		this.flow = flow;
		
	}
	
	public String getName(){
	    return super.getName();
	}
	
	public boolean hasFresh(){
	    return true;
	} 
	
	@Override
	public String toString(){
	    return "" + super.toString() + " flows into " + this.flow;
	}
}
