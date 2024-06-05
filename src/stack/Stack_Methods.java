package stack;
import java.util.*;
import java.io.*;
public class Stack_Methods {
	
  public static void main(String[] args) {
	  
 int[] numbers = new int[5];

      
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter five integer numbers:");

      for (int i = 0; i < numbers.length; i++) {
          System.out.print("Enter number " + (i + 1) + ": ");
          numbers[i] = scanner.nextInt();
      }
      
      scanner.close();
		
	  Stack<Integer> stack = new Stack<>();
	  
	  for (int number : numbers) {
	         stack.push(number);
	     }
		

   
      System.out.println("Initial Stack: " + stack);
      System.out.println("...............................");
   
      System.out.println(" top element of the"
                         + " stack is: " + stack.peek());
      System.out.println("...............................");
      
      System.out.println("Popped element: " + 
                                            stack.pop());
      System.out.println("...............................");
 
      System.out.println("Now Final Stack: " + stack);
      System.out.println("...............................");
      
      System.out.println("Now top element of the"
              + " stack is: " + stack.peek());

	}

}
