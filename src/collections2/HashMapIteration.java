package collections2;
import java.util.*;
public class HashMapIteration {

	public static void main(String[] args) {
		Map<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(new Integer(1), "Geeks");
		hm1.put(new Integer(2), "for");
		hm1.put(new Integer(3), "geeks");
		for(Map.Entry mapelement:hm1.entrySet())
		{
			int key=(int)mapelement.getKey();//Finding the key
			//Finding the value
			String value=(String)mapelement.getValue();
			System.out.println(key+":"+value);
		}

	}

}
