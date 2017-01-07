public class Factorial{

  
  public static int fact(int number){
        int result = 1;
		
        while(number != 0){
            result = result * number;
            number--;
        }
      
        return result;
    }
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			
		int result = n * factorial(n-1);
		return result;
		}
	}
	  public static void main(String args[]) {
      
      //finding factorial of a number in Java using recursion - Example
      System.out.println("factorial of 5 using recursion in Java is: " + factorial(6)); 
      
      //finding factorial of a number in Java using Iteration - Example 
       System.out.println("factorial of 6 using iteration in Java is: " + fact(5)); 
    }
}

