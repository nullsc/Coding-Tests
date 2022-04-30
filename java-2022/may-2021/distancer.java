import java.util.Arrays;
import java.util.List;

public interface distancer<A, B> {
    int distance(A x, B y); // needs to be declared in all implementations
    
    default int totalDistance(List<A> xs, List<B> ys) {
        if(xs == null || ys == null){
            throw new IllegalArgumentException();
        }
        if(xs.size() != ys.size())
            throw new IllegalArgumentException();
            
        int distance = 0;
        for(int i =0; i<xs.size(); i++){
            distance += distance(xs.get(i), ys.get(i));
        }
            
        return distance;
    }
}
