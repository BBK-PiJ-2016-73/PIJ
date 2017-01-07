/*
Write a program that reads the X and Y coordinates of three points and then outputs which of the three are closer. Use the following class to store the data for the points
*/

class Point {
	double x;
	double y;
}

public static double distance(Point p1, Point p2) 
{
   int dx = p1.x - p2.x;
   int dy = p1.y - p2.y;

   return Math.sqrt(dx * dx + dy * dy);
}

Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter a the x cordinate of pont 1: ");
double  x = reader.nextDouble();

System.out.println("Enter the y cordinate of point 1: ");
double  y = reader.nextDouble();

System.out.println("Enter a the x cordinate of point 2: ");
double  xx = reader.nextDouble();

System.out.println("Enter the y cordinate point 2: ");
double  yy = reader.nextDouble();

System.out.println("Enter a the x cordinate of point 3: ");
double  xxx = reader.nextDouble();

System.out.println("Enter the y cordinate point 3: ");
double  yyy = reader.nextDouble();

Point pt1= new Point();
pt1.x = x;
pt1.y = y;

Point pt2 = new Point();
pt2.x = xx;
pt2.y = yy;

Point pt3 = new Point();
pt3.x = xxx;
pt3.y = yyy;

double pt1pt2result = distance(pt1, pt2);
double pt1pt3result = distance(pt1, pt3);
double pt2pt3result = distance(pt2, pt3);

System.out.println("The distance between point 1 and point 2 is : " + pt1pt2result + "\n");
System.out.println("The distance between distance 3 and point 1 is : " + pt1pt3result + "\n");
System.out.println("The distance between distance 2 and point 3 is : " + pt2pt3result + "\n");

