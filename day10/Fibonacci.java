public class Fibonacci{
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2); // method calls itself
			return result;
			}
		}
		
	public static int fibonacci(int n){
		if (n == 1 || n == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, result = 1;
		for (int i = 3; i <= n; i++) {
			//  sum of previous two Fibonacci number
			result = fibo1 + fibo2; 
			fibo1 = fibo2;
			fibo2 = result;
 
		}
		// Fibonacci number
		return result; 
	}
	public static void main(String args[]) {
      
      //finding Fibonacci of a number in Java using recursion - Example
      System.out.println("Fibonacci of 5 using recursion in Java is: " + fib(5)); 
      
      //finding Fibonacci of a number in Java using Iteration - Example 
       System.out.println("Fibonacci of 5 using iteration in Java is: " + fibonacci(5)); 
    }
}