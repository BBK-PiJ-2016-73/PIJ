public class SmartPhone extends MobilePhone{
	
	private String gpsPosition = "GPS-found position 45, 58 98";
	private String brand = null;
	
    public SmartPhone(String brand)	{
		super(brand);
	}

	public void browseWeb(String web){
	}
 
	public String findPosition(){
		return gpsPosition;
	}

   	public void call(String number)
	{
		if(number.indexOf("00")!=-1)
		{
			System.out.println("Calling " + number + " through the internet to save money" );
		}
		else{

			System.out.println("Calling base class \n");
			super.call(number);
		}
	}
		public String getBrand() {
		return brand;
	}
}