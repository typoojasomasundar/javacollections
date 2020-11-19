package collections2;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class PriorityBlockingQueueImplementation {

	public static void main(String[] args) {
		Queue<Integer> pbq=new PriorityBlockingQueue<Integer>();
		pbq.add(10);
		pbq.add(20);
		pbq.add(30);
		//Printing the top element of the priority blocking queue
		System.out.println(pbq.peek());
		//Printing the top element and removing it from the PriorityBlockingQueue
		System.out.println(pbq.poll());
		//Printing the top element once again
		System.out.println(pbq.peek());
		

	}

}
