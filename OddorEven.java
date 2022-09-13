import java.util.Scanner;

public class OddorEven {
    public static void main(String arg[]){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        num= sc.nextInt();
         if((num%2)==0)
         {
            System.out.println("The number is Even");
         }
         else
         {
            System.out.println("The number is Odd");
         }
         
    }
}
