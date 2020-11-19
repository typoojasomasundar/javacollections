package collections2;
import java.util.*;
public class QueueAdd {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		//Printing the top element of the priority queue
		System.out.println(pq.peek());//peek method is used to print the top element in a priority queue
		//Printing the top element and removing it from the Priority Queue container
		System.out.println(pq.poll());
		//Printing the top element again
		System.out.println(pq.peek());
		

	}

}
