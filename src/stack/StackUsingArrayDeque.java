package stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class StackUsingArrayDeque {

	public static void main(String[] args) {
		   // Creating an ArrayDeque to use
        // as a Stack
        Deque<Integer> stack = new ArrayDeque<Integer>();
 
        // Inserting elements in the Stack
        // using push() operation
        stack.push(17);
        stack.push(19);
        stack.push(15);
 
        // Printing the elements
        System.out.println("Stack after insertion: "
                           + stack);
 
        // Removing elements from the Stack
        // using pop() operation
        stack.pop();
        System.out.println("Stack after deletion: "
                           + stack);
        
        stack.peek();
           System.out.println("Top Element" +stack.peek());
 
        stack.pop();
        System.out.println("Stack after deletion: "
                           + stack);
    }


	}


