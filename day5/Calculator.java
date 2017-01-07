/*
** Create a Java class called Calculator. The class should implement the following methods, each of them printing
** the result on the screen.
*/

public class Calculator
{
	//adds two values and print out the results to the calling function
	public int add(int inputValOne, int inputValTwo)
	{
	 int results = 0;
	  try
	  {	
		  results = inputValOne + inputValTwo;
	  }
	  catch(NumberFormatException e)
	  {
       System.out.println("Please enter a valid integer number. Error processing imput.");
	  }
	  return results ;
	}
	
	//subtract two values and print out the results to the calling function
    public int subtract(int inputValOne, int inputValTwo)
	{
	  int results = 0;
	  try
	  {	
		  results =  inputValOne - inputValTwo;
	  }
	  catch(NumberFormatException e)
	  {
        System.out.println("Please enter a valid integer number. Error processing imput.");
	  }
	  return results;
	}
	
	//multiply two values and print out the results to the calling function
    public int multiply(int inputValOne, int inputValTwo)
	{
	  int results = 0;
	  try
	  {	
		  results =  inputValOne * inputValTwo;
	  }
	  catch(NumberFormatException e)
	  {
        System.out.println("Please enter a valid integer number. Error processing imput.");
	  }
	    return results;
	}
	//divide two values and print out the results to the calling function
    public double divide(int inputValOne, int inputValTwo)
	{
	  double  results = 0.0;
	  try
	  {		
        double x = Double.valueOf(inputValOne);  
		double y = Double.valueOf(inputValTwo);
		
		results = x / y;
	  }
	  catch(NumberFormatException e)
	  {
        System.out.println("Please enter a valid integer number. Error processing imput.");
	  }
	  return results;
	}
	//divide two values and print out the results to the calling function
    public int modulus(int inputValOne, int inputValTwo)
	{
	  int results = 0;
	  try
	  {	
		  results = inputValOne % inputValTwo;
	  }
	  catch(NumberFormatException e)
	  {
       System.out.println("Please enter a valid integer number. Error processing imput.");
	  }
	    return results;
	}	
}

