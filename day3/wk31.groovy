
double d1 = 1.255;
double d2 =  d1 + 7 - 4 - 3;  

//display the old value of d2 content to the user
print("Old value of d2 is : " + d2 + "\n");

//convert and round-up the values
d2 = Double.parseDouble(String.format("%.4g%n",d2));
print("New value of d2 after conversion is now : " + d2 + "\n");

if (d1 == d2) 
{ 
  println("1.255 is equal to 1.255 plus 7 minus 7"); 
} 
else 
{
  println("1.255 is NOT equal to 1.255 plus 7 minus 7"); 
}

