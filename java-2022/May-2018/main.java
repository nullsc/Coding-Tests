//
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ArrayList<Pair<String,Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>("a",3));
        pairs.add(new Pair<>("b",1));
        pairs.add(new Pair<>("a",2));
        System.out.println(decode(pairs));
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("a");
        strings.add("a");
        strings.add("b");
        strings.add("a");
        strings.add("a");
        strings.add("c");
        System.out.println(encode(strings));
        //System.out.println(getInput());
        
        
        //Tree[] ar = new Tree[2];  // not working
        //Tree t = new Tree(5, ar);
        //ar[0] = new Tree(6);
       // ar[1] = new Tree(3);
        
        
        //System.out.println(t.getLeafValues());
        System.out.println(containChar("test", 'a')); // false
	}
	
	public static <E> ArrayList<E> decode(ArrayList<Pair<E,Integer>> runLength){
        ArrayList ret = new ArrayList<E>();
        
        for(Pair<E, Integer> i: runLength){
            for(int x=0; x < i.getSecond(); x++){
                //System.out.print(i.getFirst());
                ret.add(i.getFirst());
            }
        }
        
        return ret;
    }
    
    public static <E> ArrayList<Pair<E,Integer>> encode(ArrayList<E> data){ // not working, doesn't count last
        ArrayList ret = new ArrayList<E>();
        ArrayList pair = new ArrayList<Pair<E, Integer>>(); // temp pair
        // ArrayList<Pair<E,Integer>> result = new ArrayList<>() // or
        
        int count = 1;

        
        for (int i=1; i< data.size(); i++){
            System.out.println(data.get(i-1) + ":" + data.get(i));
            if(data.get(i).equals(data.get(i-1))){
                count++;
            } else {
                Pair p = new Pair<>(data.get(i-1), count);
                ret.add(p);
                count = 1;
            }
           
        }
        return ret;
    }
    
    public static int getInput(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int count = 0;
        
    	while(sc.hasNext()){ // or sc.hasNextInt()
    	    if(sc.hasNextInt()){
    	        if(sc.nextInt() == 0)
    	            break;
    	        count++;
    	    } else {
    	        return -1;
    	    }
    	}
        return count;
    }
    
    public static boolean containChar(String s, char c){
        if(s.length() < 1)
            return false;
       
        if(s.charAt(0) == c)
            return true;
        else
            return  containChar(s.substring(1), c);
    }
}
