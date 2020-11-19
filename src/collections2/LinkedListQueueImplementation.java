package collections2;
import java.util.*;
public class LinkedListQueueImplementation {

	public static void main(String[] args) {
		Queue<Integer> l1=new LinkedList<Integer>();
		//Adding items using the add method
		l1.add(10);
		l1.add(15);
		l1.add(20);
		//Printing the top element of the linked list
		System.out.println(l1.peek());
		//Printing the top element and removing it from the LinkedList container
		System.out.println(l1.poll());
		//Printing the top element again
		System.out.println(l1.peek());
		

	}

}
