/*
Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”; if the user enters "23 * 4" the program outputs "92"
*/

boolean bContinue= false;
while(!bContinue)
{
print("\n");

//prompt user for a string containing mathematical operation
println("Please enter any mathematical operation (0 to quit the programme): ");
String strOp = System.console().readLine();

String operationType = strOp;

for (int i = 0; i < strOp.length(); i++) 
{ 
   char c = strOp.charAt(i); 

   if (c == '+') 
   { 
     operationType = "Addition"; 
     bContinue = SetOperandValue("\\+", strOp, operationType);    
     break;
   } 
  else if (c == '-') 
  { 
     operationType = "Substraction";
     bContinue = SetOperandValue("\\-", strOp, operationType); 
      break;
  }
 else if (c == '/') 
  { 
     operationType = "Division"; 
     bContinue = SetOperandValue("\\/", strOp, operationType); 
     break;
  }
 else if (c == '*') 
  { 
    operationType = "Multiplication";
    bContinue =  SetOperandValue("\\*", strOp, operationType);
    break;
  }
}
//user request to end programme
	if(operationType == "0")
	{
 	  bContinue =  SetOperandValue("", "", operationType);
	}
}

/*
*
*
*/
public static boolean SetOperandValue(String c, String ops, optType)
{
    boolean bContinue = false;
    double opleftValue = 0.0;
    double oprightValue = 0.0;
    double result = 0.0; 

if(ops.length() != 0)
{
    String[] opOperands = ops.split(c);

    opleftValue = Double.parseDouble(opOperands[0]);
    oprightValue = Double.parseDouble(opOperands[1]);
}
switch(optType)
{
  case "Addition":
	result =  opleftValue + oprightValue ;
	print("\n");
	println("The result for adding " + ops + " is : " + result + "\n\n");
	break;
  case "Substraction":

	result =  opleftValue - oprightValue ;
	print("\n");
	println("The result for subtracting " + ops + " is : " + result + "\n\n");
	break;
  case "Multiplication":
	result =  opleftValue * oprightValue ;
	print("\n");
	println("The result for multiplying " + ops + " is : " + result + "\n\n");
	break;
  case "Division":
	result =  opleftValue / oprightValue ;
	print("\n");
	println("The result for dividing " + ops + " is : " + result + "\n\n");
    	break;
  case "0":
	bContinue = true;
	System.exit(0);
	break;	
  default:
       println("Invalid mathematical operation requested.");
       break;
 }

return bContinue;
}
 