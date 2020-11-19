package collections2;
import java.util.*;
public class HashMapAddOperation {

	public static void main(String[] args) {
//Creating objects   
Map<Integer,String> hm1=new HashMap<>();
   Map<Integer,String> hm2=new HashMap<>();
   //Inserting the elements
   hm1.put(1, "Geeks");
   hm1.put(2, "For");
   hm1.put(3, "Geeks");
   hm2.put(new Integer(1), "Geeks");
   hm2.put(new Integer(2), "for");
   hm2.put(new Integer(3), "geeks");
   //Printing the elements
   System.out.println(hm1);
   System.out.println(hm2);

	}

}
