  boolean running = true;
 while (running) 
 {
  println ("What would you like to do?");
  println ("1 - Enter any binary number to return the decimal equivalent");
  println ("2 - Enter decimal number to return a binary number");
  println ("0 - Exit");

  
  //Scanner reader = new Sca(System.in);
  //int imput = reader.nextInt();
   try
   {
	  String imput = System.console().readLine();
	  
	  int option = Integer.parseInt(imput);

	  switch (option) 
	  {
		case 0: running = false;
		  break;
		case 1: 
		  binary2decimal();
		 break;
		case 2:
		 println("Enter a decimal number to return a binary equivalent.");
		  int opt = requestInput();
		  int result =  decimal2binary(opt);
		  println(result);
		 break;
	   default: 
		println ("Invalid option. Please try again.");
	  }
	}
	catch(NumberFormatException e)
	{
		running = false;
        println("Please enter a valid integer. Error processing imput.");
	}
 }

int requestInput() 
{
   String result = System.console().readLine();
   try
   {
    int opt = Integer.parseInt(result);
	
   }
   catch(NumberFormatException ex)
	{
		//running = false;
        	println("Please enter a valid integer. Error processing imput.");
	}
	
	return option;
 }
 
 //Takes a base b and an exponent e from the user, and returns
 int power(int b, int e )
 {
    int results = 0;
    results= (Math.log(e) / Math.log(b));
    return results;
 }
 
//Takes an exponent e from the user and returns the result of 2e. This method must call the previous
//one to find out the result.
int power2(int e )
{
 int results = power(2, e);
 return results;
}
 
 
/*Takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 101 + 5 · 100, you can find that 100011 = 1 · 25 + 1 · 21 + 1 · 20. This method must call the previous
one to find out the result.*/

int binary2decimal(int n)
 {
  int results = power(10, n);
  return results;
 }
 
 void binary2decimal()
 {
    println("You selected option 1 : Enter any binary number");
   String result = System.console().readLine();
   try
   {
        int inputValue = Integer.parseInt(result);
        if(isNumberBinary(inputValue))
        {
	  int retVal = binary2decimal(inputValue);
	  println(retVal );
        }
        else
        {
	 print("Error processing your request. You entered an invalid binary number. Binary numbers are in a format with digits 0 and 1 \n\n");
	 binary2decimal();
       }
	
   }
   catch(NumberFormatException ex)
   {
          running = false;
          println("Please enter a valid binary number. Error processing imput.");
   }
	
 }

 boolean isNumberBinary(int inputVal) 
{ 
 int value = inputVal;
 while (value != 0) 
  { 
	if (value % 10 > 1) 
	{ 
	  return false;
	} 
      value = value / 10; 
   } 
	return true; 
}


//The opposite of the previous one: takes a decimal number and returns the corresponding
//binary number.
 int decimal2binary(int n)
 {
  int results = power(2, n);
  return results;
 }