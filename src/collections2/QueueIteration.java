package collections2;
import java.util.*;
public class QueueIteration {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		Iterator iterator=pq.iterator();//Creating the iterator object
		while(iterator.hasNext())
			System.out.println(iterator.next()+" ");

	}

}
