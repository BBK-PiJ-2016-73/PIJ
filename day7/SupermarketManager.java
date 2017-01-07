public class SuperMarketManager {
	
	public static PersonQueue menu;
	public static void main(String[] args) 
	{
		menu = new PersonQueue();
	   
		 boolean running = true;
		 while (running) 
		 {
		  System.out.println ("What would you like to do?");
		  System.out.println ("1 - Add a new person to quue ");
		  System.out.println ("2 - remove an existing person ");
		  System.out.println ("0 - Exit");
		  System.out.println("\n >");
		  
		   try
		   {
			  String userInput = System.console().readLine();
			  
			  int userSelection = Integer.parseInt(userInput);

			  switch (userSelection) 
			  {
				case 0: running = false;
				  break;
				case 1: 
					//prompt for person details to be added to the list				
						menu.addPersonMenu();		
				 break;
				case 2: 
                    //prompt for person details to be deleted from the list				
					menu.removePersonQueueMenu();		
				 break;
			
			   default: 
				System.out.println ("Invalid option selected. Please try again.");
			  }
			}
			catch(NumberFormatException e)
			{
				running = false;
				System.out.println("Please enter a valid integer. Error processing imput.");
			}
		 }
	}
	
	
}