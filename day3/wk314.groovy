Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Please type in some text");

print reader;

for(int i=0; i < reader.length()-1;i++)
{
 print reader.CharAt(i-1);
}