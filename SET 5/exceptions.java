import java.util.Scanner;
class exception
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("\n\nEnter the values for the expression: \n\nx = a/(b-c)\nEnter: ");
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  
  System.out.print("\n\n(i)  Arithmatic Exception\n----------------------------");
  try
  {
   int x=a/(b-c);
   System.out.print("ANSWER: "+(a/(b+c)));
  }
   catch(ArithmeticException e)
   {
    System.out.println("\nDivision by zero!!\n");
   }
   
   System.out.print("\n\n(ii)  Array out of bounds Exception\n----------------------------");
   int p[]={5,10};
   System.out.print("\nEnter the index: ");
   int q = sc.nextInt();
   try
   {
    int y=p[q]/(q-p[1]);
    System.out.print("ANSWER: "+y+"\n\n\n");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("Array index error !!\n\n");
   }
 }
}
           
