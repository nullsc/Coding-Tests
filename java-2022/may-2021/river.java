public class river extends waterbody
{
    private boolean fresh;
    private waterbody flow;
    
	public river(String name, waterbody flow) {
		//System.out.println("Hello World");
		super(name);
		this.flow = flow;
	}
	
	public String getName(){
	    return super.getName();
	}
	
	@Override
	public boolean hasFresh(){
	    return true;
	} 
	
	@Override
	public String toString(){
	    return "" + super.toString() + " flows into " + this.flow;
	}
}
