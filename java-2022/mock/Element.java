import java.util.ArrayList;

public class Element<T> {
    private T data;
    private Element<T> next;
    
    Element(T data, Element<T> next){
        this.data = data;
        this.next = next;
    }
    
    public void copyAr(ArrayList<T> ls){
        ls.add(data);
        if(next != null){
            next.copyAr(ls);
        }
    }
}
