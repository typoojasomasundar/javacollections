package collections2;
import java.util.*;
public class HashMapChangeOperation {

	public static void main(String[] args) {
		Map<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(new Integer(1), "Geeks");
		hm1.put(new Integer(2), "geeks");
		hm1.put(new Integer(3), "geeks");
		System.out.println("Initial Map:"+hm1);
		hm1.put(new Integer(2), "for");
		System.out.println("Updated map:"+hm1);

	}

}
