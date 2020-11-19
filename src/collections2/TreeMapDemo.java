package collections2;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<>();
		map.put("Vishal", 10);
		map.put("Ramesh", 20);
		map.put("Vaibhav", 30);
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
