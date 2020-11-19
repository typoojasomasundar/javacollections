package collections2;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
	Queue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(100);
	pq.add(120);
	pq.add(130);
	//Printing the element at the top of the priority queue
	System.out.println(pq.peek());
	//Prnting the element and removing it from the Priority Queue container
	//130 is removed from the PriorityQueue container
	System.out.println(pq.poll());
	//Printing the top element again
	System.out.println(pq.peek());

	}

}
