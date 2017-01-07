public class PhoneLauncher {
	
	public static void main(String[] args)
	{
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() 
	{
	
		// your code creating and using SmartPhone here...
		SmartPhone sp = new SmartPhone("NoKia brand");
		sp.printLastNumbers();
		sp.browseWeb("https://moodle.bbk.ac.uk");
		System.out.println("My gps position " + sp.findPosition());
		System.out.println("\n");
		sp.call("00178956");
		System.out.println("This brand of phone is " + sp.getBrand());
		
		MobilePhone mp = new MobilePhone("Microsoft brand");
		mp.call("387773737");
		mp.playGame("Playing mobile phone class game");
		mp.ringAlarm("Ringing mobile phone class alarm");
		System.out.println("This brand of phone is " + mp.getBrand());
	}
}