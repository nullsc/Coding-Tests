/******************************************************************************

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		//waterbody test = new waterbody("Pool");
		
		still sea = new still("North Sea", false);
        river r1 = new river("Thames", sea);
        river r2 = new river("Lea", r1);
        System.out.println(r2);
        System.out.println(r1.hasFresh());
        System.out.println(sea.hasFresh());
		
	List<String> xs = Arrays.asList(new String[]{"Hello", "World", "!"});
        List<Integer> ys = Arrays.asList(new Integer[]{1, 2, 3});
        int d = (new LengthDistancer()).totalDistance(xs, ys);
        System.out.println(d); // prints 9
		
		System.out.println(lastValue(new Object[]{new Object(), 1.5, 3, "42"}));
	}
	
	/*
	Go throgh an array and find the last index that has float number 
	*/
	public static double lastValue(Object[] arr){
	    double index = -1;
	    
	    for(int i=arr.length-1; i>=0; i--){
	        if(arr[i] instanceof Number){ // check if it's a number
    	        Number x = (Number)arr[i]; // cast
    	        double y = x.doubleValue(); //cast
    	        //System.out.println(y);
    	       index = y;
    	       break; // found so break loop
	        }
	    }
	    return index;
	}
}
