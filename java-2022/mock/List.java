import java.util.ArrayList;

public class List<T> {
    private Element<T> head;
    
    List(ArrayList<? extends T> ls){ // linkedlist
        for(int i=ls.size()-1; i>=0; i--){ // traverse backwards
            head = new Element(ls.get(i), head);
            
        }
        
    }
}
