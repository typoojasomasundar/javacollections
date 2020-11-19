package collections2;
import java.util.*;
public class QueueRemove {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		System.out.println("Initial queue"+pq);
		pq.remove("Geeks");
		System.out.println("After remove:"+pq);
		System.out.println("Poll method:"+pq.poll());
		System.out.println("Final queue:"+pq);

	}

}
