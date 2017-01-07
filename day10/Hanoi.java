public class Hanoi{
	
	public static void main(String args[]) {     
      //
      System.out.println("Hanoi disk: " + Hanoidisks(4)); 
    }
	
	public static int Hanoidisks(int number){
		int results=0;
		
		if(number == 1){
			return 2;
		}
		else{
			results= 2 * Hanoidisks(number - 1);
		}
		
		return results;
	}
}