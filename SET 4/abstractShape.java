import java.util.Scanner;
abstract class Shape
{
 abstract void numberOfSides();
}

class rectangle extends Shape
{
  void numberOfSides()
  {
  System.out.println("Number of sides is: 4");
  }
}

class Triangle extends Shape
{
  void numberOfSides()
  {
  System.out.println("Number of sides is: 3");
  }
}

class Hexagon extends Shape
{
  void numberOfSides()
  {
  System.out.println("Number of sides is: 6");
  }
}

public class abstractShape
{
 public static void main(String args[])
 {
  Shape obj1 = new rectangle();
  Shape obj2 = new Triangle();
  Shape obj3 = new Hexagon(); 
  obj1.numberOfSides();
  obj2.numberOfSides();
  obj3.numberOfSides();
 }

}

