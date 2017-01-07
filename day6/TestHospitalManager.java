public class TestHospitalManager {
	
	public static  HospitalManager hospitalManager;
	public static void main(String[] args) 
	{
	   hospitalManager = new HospitalManager();
	   
	   //Patient fPatient = hm.getFirstPatient();
		//System.out.println("Patient name: " + fPatient.getName());
		
		
		boolean running = true;
		 while (running) 
		 {
		  System.out.println ("What would you like to do?");
		  System.out.println ("1 - Add a new patient file");
		  System.out.println ("2 - Delete an existing patient file");
		  System.out.println ("3 - List existing record size");
		  System.out.println ("4 - Display all items in the list:");
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
					//prompt for patient details to be added to the list				
					hospitalManager.addPatientMenu();					
				 break;
				case 2: 
                    //prompt for patient details to be deleted from the list				
					hospitalManager.deletPatientMenu();				
				 break;
				 case 3: 
					System.out.println("Number of patient record in the list is : " + hospitalManager.patientRecordSize());
				 break;
				  case 4: 
					hospitalManager.display();
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
