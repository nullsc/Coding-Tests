import java.util.ArrayList;

public interface Filter<T> {
    boolean accept(T object);
    
    default int countAccepted(ArrayList<T> list){
        if(list == null)
            throw new IllegalArgumentException();
            
        int result = 0;
        for(T i: list){ // iterate
            if(this.accept(i))
                result++;
        }
        
        return result;
    }
}
