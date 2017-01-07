/*
** Create a Java class called Calculator. The class should implement the following methods, each of them printing
** the result on the screen.
**/

public class Calculator
{
    private int results = 0;
	
	public Calculator()
	{
	}
	
	//adds two values and print out the results to the calling function
	public add(int inputValOne, int inputValTwo)
	{	
	 private int result = 0;	
	  try
	  {	
		  result = inputValOne + inputValTwo;
		  println("Resuslts for adding " + inputValOne + " and + inputValTwo + " is : " result);
	  }
	  catch(NumberFormatException e))
	  {
        println("Please enter a valid integer number. Error processing imput.");
	  }
	}
	
	//subtract two values and print out the results to the calling function
    public subtract(int inputValOne, int inputValTwo)
	{
	  private int result = 0;
	  try
	  {	
		  results = inputValOne - inputValTwo;
		  println("Resuslts for substracting " + inputValOne + " from + inputValTwo + " is : " result);
	  }
	  catch(NumberFormatException e))
	  {
        println("Please enter a valid integer number. Error processing imput.");
	  }
	}
	
	//multiply two values and print out the results to the calling function
    public multiply(int inputValOne, int inputValTwo)
	{
	  private int result = 0;
	  try
	  {	
		  results = inputValOne * inputValTwo;
		  println("Resuslts for multiplying " + inputValOne + " and + inputValTwo + " is : " result);
	  }
	  catch(NumberFormatException e))
	  {
        println("Please enter a valid integer number. Error processing imput.");
	  }
	}
	//divide two values and print out the results to the calling function
    public divide(int inputValOne, int inputValTwo)
	{
	  private double result = 0;
	  
	  try
	  {	
	    double val1 = Double.valueOf(inputValOne);
		double val2 = Double.valueOf(inputValTwo);
		
		results =  val1 / val2;
		println("Resuslts for dividing " + inputValOne + " and + inputValTwo + " is : " result);
	  }
	  catch(NumberFormatException e))
	  {
        println("Please enter a valid integer number. Error processing imput.");
	  }
	}
	//divide two values and print out the results to the calling function
    public modulus(int inputValOne, int inputValTwo)
	{
	  private int result = 0;
	  try
	  {	
		  results = inputValOne % inputValTwo;
		  println("Resuslts for multiplying " + inputValOne + " and + inputValTwo + " is : " result);
	  }
	  catch(NumberFormatException e))
	  {
        println("Please enter a valid integer number. Error processing imput.");
	  }
	}
}
Calculator cal = new Calculator();
println("Calling calculator add method " + cal.add(4, 8););
