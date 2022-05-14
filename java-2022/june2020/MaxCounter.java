public class MaxCounter extends Counter {
    private int maxcount;
    
    @Override
    public void click() {
        super.click();
        if(super.getCount() > maxcount)
            maxcount = super.getCount(); 
    }
    
    @Override
    public String toString() {
        return "the count is " + super.getCount() + " and the maximum was " + maxcount;
    }
}
