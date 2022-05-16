import java.util.ArrayList;
import java.util.Map;

public class Tree<A> {
    private A data;
    private ArrayList<Tree<A>> children;
    
    public Tree(A data, ArrayList<Tree<A>> children) {
        this.data = data;
        this.children = children;
    }
    
    public void updateInPlace(Map<A, A> substitution){
        A newVal = substitution.get(data); // {2, 30} replace 2 with 30
        
        if (newVal != null) { // if this node it not being replaced then it will return null as there is no mapping for the value
            data = newVal;
        }
        for (Tree<A> child : children) {
            child.updateInPlace(substitution); //recursion
        }
    }
    
    public <B> Tree<B> updateNew(Map<A, B> substitution, B defValue){
        B newVal = substitution.get(data);
        
        if (newVal == null) { // no mapping, set to default value
            newVal = defValue;
        }
        
        ArrayList<Tree<B>> ret = new ArrayList<>();
        for (Tree<A> child : children) {
            Tree<B> newChild = child.updateNew(substitution, defValue); //recursion
            ret.add(newChild);
        }
        
        return new Tree<B>(newVal, ret);
    }
    /*
    public static double average(Tree<Integer> tree){
        
        double total = 0;
        total += (double)data; // current node
        for(Tree<Integer> i: tree){
            i.average();
        }
        return total;
    }*/
}
