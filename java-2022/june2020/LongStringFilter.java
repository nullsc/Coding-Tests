
public class LongStringFilter implements Filter<String>, Valuable{
    
    private int minimumLength;
    
    public LongStringFilter(int minimumLength){
        this.minimumLength = minimumLength;
    }
    
    public boolean accept(String s){
        if(s.length() >= minimumLength)
            return true;
            
        return false;
    }
    
    public static double sumValues(Object[] arr){
        double result = 0;
        
        for(Object i: arr){
            if(i instanceof Valuable){
                Valuable o = (Valuable)i; // need to cast
                result += o.getValue();
            }
        }
        return result;
    }
    
    public double getValue(){
        return 0; // dud function
    }
}
