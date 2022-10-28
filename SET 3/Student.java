import java.util.Scanner;
public class Student {
    String name ;
    int rollNum;
    int marks[]= new int[5];
    Scanner sc = new Scanner(System.in);
    void Read()
    {

      System.out.print("Enter the Student name: ");
      name = sc.nextLine();
      System.out.print("Enter the Student Roll Number: ");
      rollNum = sc.nextInt();
      System.out.print("Enter the Student Marks: ");
      for(int i=0;i<5;i++)
      {
         marks[i]=sc.nextInt();
      }

    }
    void Display()
    {
      System.out.println("Student Name: "+name);
      System.out.println("Student Roll num: "+rollNum);
      System.out.println("Student marks: ");
      for(int i=0;i<5;i++)
      {
         int si=i+1;
         System.out.println(si+"."+" "+marks[i]);
      }
    }

    public static void main(String args[])
    {
       Student obj = new Student();
       obj.Read();
       obj.Display();
    }
}


