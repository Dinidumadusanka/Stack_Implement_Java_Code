package stack;
import java.util.ArrayList;

public class StackUsingArrayList<D> {
	 private ArrayList<D> stackList;

	    // Constructor to initialize the stack
	    public StackUsingArrayList() {
	        stackList = new ArrayList<>();
	    }

	    // Function to check if the stack is empty
	    public boolean isEmpty() {
	        return stackList.isEmpty();
	    }

	    // Function to push an element onto the stack
	    public void push(D value) {
	        stackList.add(value);
	    }

	    // Function to pop an element from the stack
	    public D pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return null;
	        }
	        return stackList.remove(stackList.size() - 1);
	    }

	    // Function to get the top element of the stack without popping it
	    public D peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return null;
	        }
	        return stackList.get(stackList.size() - 1);
	    }
	

	public static void main(String[] args) {
		  StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Top element: " + stack.peek()); // Outputs: 30
	        System.out.println("Popped element: " + stack.pop()); // Outputs: 30
	        System.out.println("Top element after pop: " + stack.peek()); // Outputs: 20

	}

}
