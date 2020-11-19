package collections2;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<String,Integer>();//Creating the map object
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));  //With the help of put method Im adding 4 integer values
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));
		//Traversing through the map
		for(Map.Entry<String,Integer> me:hm.entrySet()) {
			System.out.println(me.getKey()+" ");
		System.out.println(me.getValue());
		}

	}

}
