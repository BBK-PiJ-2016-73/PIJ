<<<<<<< HEAD
/*
Write a program that reads two numbers from the user and then o?ers a menu with the four basic operations: addition, subtraction,multiplication, and division. Once the user has selected an operation from the menu, the calculator performs the operation.
*/

boolean bContinue= false;
while(!bContinue)
{
print("\n");
//prompt user for first value
println("Please enter first value : ");
double value1 = Double.parseDouble(System.console().readLine());

//prompt user for second value
println("Please enter second value : ");
double value2 = Double.parseDouble(System.console().readLine());

//present menu options for user
print("***Please select an option*** \n");
print("Enter 1 for addition  \n");
print("Enter 2 for Subtraction  \n");
print("Enter 3 for Multiplication \n")
print("Enter 4 for Division  \n")
print("Enter 0 to quit the programe.\n")

//Scanner in = new Scanner(System.in);
//int choice = in.nextInt();

//get and store user input
int choice  = Integer.parseInt(System.console().readLine());

//perform type of operation based on user selection
switch(choice)
{
  case 1:
	double result =  value1 + value2 ;
	print("You select option 1 addition\n");
	println("The result for adding " + value1 + " and " + value2 + " is : " + result + "\n\n");
	break;
  case 2:
	double result =  value1 - value2 ;
	print("You select option 2 subtraction\n");
	println("The result for subtracting " + value1 + " from " + value2 + " is : " + result + "\n\n");
	break;
  case 3:
	double result = value1 * value2 ;
	print("You select option 3 Multiplication\n");
	println("The result for multiplying " + value1 + " and " + value2 + " is : " + 	result + "\n\n");
	break;
  case 4:
	double result =  value1 / value2 ;
	print("You select option 4 Division\n");
	println("The result for dividing " + value1 + " and " + value2 + " is : " + result + "\n\n");
    	break;
  case 0:
	bContinue = true;
	System.exit(0);
	break;	
  default:
       println("Invalid selection made");
       break;
}
}

double Calculator(int value1, int value2, String operation)
{

  double result = (value1 * value2);
  return result;
}

=======
/*
Write a program that reads two numbers from the user and then o?ers a menu with the four basic operations: addition, subtraction,multiplication, and division. Once the user has selected an operation from the menu, the calculator performs the operation.
*/

boolean bContinue= false;
while(!bContinue)
{
print("\n");
//prompt user for first value
println("Please enter first value : ");
double value1 = Double.parseDouble(System.console().readLine());

//prompt user for second value
println("Please enter second value : ");
double value2 = Double.parseDouble(System.console().readLine());

//present menu options for user
print("***Please select an option*** \n");
print("Enter 1 for addition  \n");
print("Enter 2 for Subtraction  \n");
print("Enter 3 for Multiplication \n")
print("Enter 4 for Division  \n")
print("Enter 0 to quit the programe.\n")

//Scanner in = new Scanner(System.in);
//int choice = in.nextInt();

//get and store user input
int choice  = Integer.parseInt(System.console().readLine());

//perform type of operation based on user selection
switch(choice)
{
  case 1:
	double result =  value1 + value2 ;
	print("You select option 1 addition\n");
	println("The result for adding " + value1 + " and " + value2 + " is : " + result + "\n\n");
	break;
  case 2:
	double result =  value1 - value2 ;
	print("You select option 2 subtraction\n");
	println("The result for subtracting " + value1 + " from " + value2 + " is : " + result + "\n\n");
	break;
  case 3:
	double result = value1 * value2 ;
	print("You select option 3 Multiplication\n");
	println("The result for multiplying " + value1 + " and " + value2 + " is : " + 	result + "\n\n");
	break;
  case 4:
	double result =  value1 / value2 ;
	print("You select option 4 Division\n");
	println("The result for dividing " + value1 + " and " + value2 + " is : " + result + "\n\n");
    	break;
  case 0:
	bContinue = true;
	System.exit(0);
	break;	
  default:
       println("Invalid selection made");
       break;
}
}

double Calculator(int value1, int value2, String operation)
{

  double result = (value1 * value2);
  return result;
}

>>>>>>> 886aeb10ba45501658060f41cbf727fc83962faa
