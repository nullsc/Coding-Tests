import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;


public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Hello");
		List<String> ys = Arrays.asList(new String[]{"a", "b", "c", "c", "a"});
        System.out.println(count(ys));
  // {a=2, b=1, c=2}

	}

	// 4
	public static <E> Map<E, Integer> count(Collection<? extends E> arr){
/*
		for(int i=0; i<arr.size(); i++){ // not working
			System.out.println(arr.get(0));
		}*/

		Map<E, Integer> ret = new LinkedHashMap<E, Integer>();
		for(E c: arr){

			Integer num = ret.get(c); // need to cast, can't do ret.get(c)
			System.out.println(c);
			if(ret.containsKey(c)){
				ret.put(c, num + 1);
			} else {
				//
				ret.put(c, 1); // not in array
			}
		}
		return ret;
	}
}
