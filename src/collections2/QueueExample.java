package collections2;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		//adds the elements to the queue
		for(int i=0;i<5;i++)
			q.add(i);
		//Displays the contents of the queue
		System.out.println("Elements of queue"+q);
		
		//To remove the head of the queue
		int removedele=q.remove();
		System.out.println("Remeoved element"+removedele);
		System.out.println(q);
		//To view the head of the queue
		int head=q.peek();
		System.out.println("head of the queue"+head);
		int size=q.size();
		System.out.println("Size of the queue"+size);

	}

}
