import java.util.Scanner;
class ShapeArea
{
 int x,y;
 void Area(int r)
 {
  x=r;
  System.out.println("Area of the circle is: "+3.14*x*x);
 }
 
 void Area(int l,int b)
 {
  x=l;
  y=b;
  System.out.println("Area of the rectangle is: "+x*y);
 }
}

class MethodOverloading
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  ShapeArea obj=new ShapeArea();
  System.out.println("Enter the radius of the circle:");
  int r=sc.nextInt();
  System.out.println("Enter the length and breadth of rectangle:");
  int l=sc.nextInt();
  int b=sc.nextInt();
  obj.Area(r);
  obj.Area(l,b);
 }
}
