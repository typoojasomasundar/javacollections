package collections2;
import java.util.*;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("vishal", 10);
		map.put("Rahul", 20);
		map.put("Rakesh", 30);
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
