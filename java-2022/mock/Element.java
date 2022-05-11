public class Element<T> {
    private T data;
    private Element<T> next;
    
    Element(T data, Element<T> next){
        this.data = data;
        this.next = next;
    }
}
