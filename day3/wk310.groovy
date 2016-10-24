/*
Write a program that reads a short string and then some longer text. The program must say how many times you can ?nd the short string in the text. You cannot use any method of String apart from charAt() and length()
*/

boolean bContinue = false;

while(!bContinue)
{
 Scanner reader = new Scanner(System.in);
 println("Please enter a short text or (enter 0 to quit): ");
 String sShortStr = reader.nextLine();

 if(sShortStr =="0")
 {
  bContinue = true;
   System.exit(0);
 }
print("Now please enter a longer text or (enter 0 to quit) : ");
 String sLongerStr = reader.nextLine();

 if(sLongerStr =="0")
 {
  bContinue = true;
   System.exit(0);
 }

 for (int i=0;i<sLongerStr.length();i++)
	{
                if (sLongerStr.charAt(i) == sShortStr.charAt(i))
		{
                      int j = i+1;
                      int l =0;
                      while (l<sShortStr.lenght && sLongerStr.charAt(j) == sShortStr.charAt(l))
			{
                               j++;i++;
                        } 
			if (l==sShortStr.lenght)
			{
                              println(sShortStr + " was found " + i + " times in " + sLongerStr );
                        }
                 }
        }
}

// for(int i=0; i < sLongerStr.length() - sShortStr.length(); i++)
// {
 //  for(int j=0; j < sShortStr.length(); j++)
//	{
//	  if(sShortStr.charAt(j) != sLongerStr.charAt(i + j))
//           {
//             i++;
//	   }
//	} 
//	 println(sShortStr + " was found " + i + " times in " + sLongerStr );
// } 
//  println(-i);
//}