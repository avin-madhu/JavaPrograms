import java.util.Scanner;
class Employee
{
  void display()
  {
  System.out.print("The name of the class is Employee");
  }
  void calcSalary()
  {
   System.out.print("The salary of the employee is 10,000");
  
  }

}

class Engineer extends Employee
{
 void calcSalary()
 {
   System.out.print("The salary of the employee is 20,000");
 } 
 void display()
 {
 
  System.out.print("The name of the class is Engineer\n");
 super.display();
  System.out.println();
 super.calcSalary();
 System.out.println();
 calcSalary();
 }
}
public class EmployeeEng 
{   
   public static void main(String args[])
   {
    
     Engineer obj = new Engineer();
     obj.display();
   
   }
}
