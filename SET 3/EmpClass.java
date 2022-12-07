import java.util.Scanner;
class Employee
{
  String name;
  int empNo;
  int PhNo;
  
  void read()
  {
  try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the name: ");
    name = sc.nextLine();
    System.out.print("Enter the Employee No: ");
    empNo = sc.nextInt();
    System.out.print("Enter the Employee phone No: ");
    PhNo = sc.nextInt();
  }
  }
  
  void display()
  {
    System.out.println("Employee name: "+name);
     System.out.println("Employee no: "+empNo);
      System.out.println("Phone Number: "+PhNo);
       System.out.println();
       System.out.println();
  }
}

public class EmpClass
{

  public static void main(String args[])
  {
     Employee obj[] = new Employee[5];
     
  for(int i=0;i<5;i++)
  {
     obj[i] = new Employee(); // constructor initialization ...
  }
  
  for(int i=0;i<5;i++)
  {
    obj[i].read();
  }
  
  for(int i=0;i<5;i++)
  {
    obj[i].display();
    System.out.println();
  }
 }
  
}



