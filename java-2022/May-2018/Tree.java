import java.util.ArrayList;

public class Tree {
    private int data;
    private ArrayList<Tree> children;
    
    public Tree(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
    
    public Tree(int data, Tree[] subtrees){
        this(data);
        for(Tree i: subtrees)
            this.children.add(i);
    }
    
    public ArrayList<Integer> getLeafValues(){
        ArrayList<Integer> ret = new ArrayList<>();
        
        if(this.children.size() == 0) // it's a leaf
                ret.add(this.data);
        else {
            for(Tree i: children){
                for(Integer x: i.getLeafValues()) // recursion
                     ret.add(x);
                    
                }
            }
        
            
        return ret;
    }
    
    public void addLeftmostLeaf(int value){
        if(this.children.size() == 0) {// it's a leaf)
            Tree t = new Tree(value);
            this.children.add(t);
        } else { // keep looking
            this.children.get(0).addLeftmostLeaf(value); // left
            
            /* or
            Tree leftmostChild = this.children.get(0);
            leftmostChild.addLeftmostLeaf(value);
            */
        }
    }
    
    
}
