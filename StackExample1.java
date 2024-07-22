import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		
		//stack.add(15);
	    for(int i=10;i<=100;i+=10)
	    {
	    		stack.push(i);
	    	// if(stack.empty()) {
	    	// 	//stack.add(i);
	    	// 
	    	// 	//stack.search(20);

	    	// 	break;
	    	// }
	    	// else {
	    	// 	System.out.println("some element are present in the stack.");
	    	// 	break;
	    	// }
	    }
	    //stack.pop();
	    System.out.println(stack.search(20));
	    System.out.println(stack);
	}

}
