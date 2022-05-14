public class Tree{
    
    private Tree left, right;
    private int data;
    
    public Tree(Tree l, Tree r, int d) {
        left = l; right = r; data = d;
    }

	public static Tree create(int height){
        if(height < 0)
            return null;
           
        
        return new Tree(create(height-1), create(height-1), -1); // data is always -1 for example
    }
    
    public boolean fill(int[] v){
        
        int result = fillFrom(v, 0);
        return result >= v.length;
    }
    
    /* inorder traverse*/
    private int fillFrom(int[] v, int pos){
        
        if (pos >= v.length) {
            return pos;
        }
        int nextPos = pos;
        
        if(this.left != null){ // traverse left
            this.left.fillFrom(v, nextPos);
        }
        
        this.data = v[nextPos]; // update this node
        nextPos++;
        
        if(this.right != null){ // traverse right
            this.right.fillFrom(v, nextPos);
        }
        
        return nextPos;
    }
}
