public class OldPhone implements Phone {
	
	private String phoneNumber;

	
	public OldPhone(){
	}

	public void call(String number){
		System.out.println("Calling... " + number);
	}
}