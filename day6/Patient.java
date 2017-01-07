public class Patient 
{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; 
	// Pointer to another patient!
	}
	public Patient(Patient newPatient)
	{
		this.nextPatient = newPatient; 
	}

	public void setPatientDetails(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		//this.nextPatient = null; 
	}
	public void displayPatient()
    {
        System.out.println( nextPatient );
    }
	
	//returns the patient name
	public String getName()
	{
		return this.name;
	}
	//returns the patient age
	public int getPatAge()
	{		
		return this.age;
	}
	
	//returns the patient illness
	public String getPatientIllness()
	{
		return  this.illness;
	}
	
	public Patient getNextPatient() 
	{
		return this.nextPatient;
	}
    //setNextPatient
	public void setNextPatient(Patient newPatient)
	{
		this.nextPatient = newPatient; 
	}
}

  //eldaw@dcs.bbk.ac.uk
  //dlbcalix@gmail.com