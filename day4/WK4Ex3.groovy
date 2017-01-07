 boolean running = true;
 while (running) 
 {
  println ("What would you like to do?");
  println ("1 - Enter any binary number to return the decimal equivalent");
  println ("2 - Enter decimal number to return a binary number");
  println ("0 - Exit");
  print("\n >");
  
  //Scanner reader = new Sca(System.in);
  //int imput = reader.nextInt();
   try
   {
	  String userInput = System.console().readLine();
	  
	  int userSelection = Integer.parseInt(userInput);

	  switch (userSelection) 
	  {
		case 0: running = false;
		  break;
		case 1: 
		  binary2decimal();
		 break;
		case 2:
		  decimal2binary();
		 break;
	   default: 
		println ("Invalid option selected. Please try again.");
	  }
	}
	catch(NumberFormatException e)
	{
		running = false;
        println("Please enter a valid integer. Error processing imput.");
	}
 }

/**
* Takes a base b and an exponent e from the user, and returns the result of be.
*/
 int power(int baseNumber, int numberExponent )
 {
	try{
 
		//parameter b is the base value which can be a base 10, base 2, base 8
		//parameter e is the exponent value
		
		//variable to return the results of the calculation
		int results = 0;
		
		results = (Math.log(numberExponent) / Math.log(baseNumber));
		
		//return the result to the calling function
	}
	catch(NumberFormatException e)
	{
       return results;
	}
    return results;
 }
 
/**
* Takes an exponent e from the user and returns the result of 2e. This method must call the previous one to ﬁnd out the result.
*/
int power2(int numberExponent )
{
	try
	{
		int results = power(2, numberExponent);
    }
	catch(NumberFormatException numberExponent)
	{
       return results;
	}
	
	return results;
}

/**
* Takes from the user a binary number (with digits 0 and 1) and returns the corresponding number in decimal (base-10, with digits between 0 and 9).
* Hint: in the same way that you know that 35 = 3 · 101 + 5 · 100, 
* you can ﬁnd that 100011 = 1 · 25 + 1 · 21 + 1 · 20. 
* This method must call the previous one to ﬁnd out the result.
*/
int binary2decimal(int binaryNumber) 
{
    int results = 0;
    try
    {
      result = power(10, binaryNumber);
	}
	catch(NumberFormatException e)
	{
       return results;
	}	
	return results;
}

/**
* The opposite of the previous one: takes a decimal number and returns the corresponding binary number. 
* Hint: instead of multiplying by 2, you will need to divide by two this time (the quotients and the last remainder will give you the binary number).
*/
decimal2binary(int decimalNumber) 
{
    int results = 0;
    try
    {
      results =  power(2, decimalNumber);
	}
	catch(NumberFormatException numberExponent)
	{
	   return results;
	}
	
	return results;
}

int decimal2binary()
{
 println("Enter a decimal number to return a binary equivalent.");
  //prompt the user for a valid decimal number and store the result for further calculation
   println("You selected option 2 : Enter any decimal number");
   String result = System.console().readLine();
		  int opt = requestInput();
		  int result =  decimal2binary(opt);
		  println(result);
}

/**
* A helper funtion to validate all user input for binary conversion to decimal.
* calls function IsNumberBinary 
*
*/
void binary2decimal()
{
  //prompt the user for a valid binary number and store in result for further calculation
   println("You selected option 1 : Enter any binary number");
   String result = System.console().readLine();
   
   try
    {
	   //parse the value for a valid integer and not a string value
       int inputValue = Integer.parseInt(result);
	   
       //if valid integer check if it's a valid binary number only 0 and 1 combination
	   if(IsNumberBinary(inputValue))
        {
		  //if all is well, go ahead an do the conversion and store the value in retVal to display the results to the user
	      int retVal = binary2decimal(inputValue);
	      
		  println("You entered : " + inputValue + " and it's equivalent decimal value is : " + retVal);
        }
        else
        {  //somethning went wrong 
	       print("Error processing your request. You entered an invalid binary number. Binary numbers are in a format with digits 0 and 1 \n\n");
	       
		   //prompt the user again for a valid binary number
		   binary2decimal();
        }
	
    }
    catch(NumberFormatException ex)
    {
          running = false;
          println("Please enter a valid binary number. Error processing imput.");
    }	
}
 
/**
* This is a helper function that returns true or false if a number provide by the user is a valid binary number
*
*/
boolean IsNumberBinary(int inputVal) 
{ 
 //get the valid provided and store in the local variable value for further calculation
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
