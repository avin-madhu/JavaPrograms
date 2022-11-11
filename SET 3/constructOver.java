import java.util.Scanner;
class Perimeter
{
  int x,y;
  
  Perimeter(int r)
  {
    x=r;
   System.out.print("The Perimeter of the circle is: "+(2*x*3.14));
    
  }
  
  Perimeter(int a,int b)
  {
   x=a;
   y=b;
   System.out.print("The perimeter of the rectangle is: "+2*(x+y));
  }
}

class constructOver
{

   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     int r = sc.nextInt();
     System.out.print("Enter the length and breadth: ");
     int l = sc.nextInt();
     int b = sc.nextInt();
      
     
     Perimeter obj1 = new Perimeter(r);
     System.out.println();
     Perimeter obj2 = new Perimeter(l,b);
   }
}