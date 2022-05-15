import java.util.ArrayList;

public interface Converter<A, B> {
    B convert(A xs);
    
    default ArrayList<B> convertAll(ArrayList<A> xs){
        ArrayList<B> ret = new ArrayList<>();
        
        for(A i: xs){
            ret.add(convert(i));
        }
        return ret;   
    }
}
