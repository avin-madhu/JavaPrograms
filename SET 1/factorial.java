import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        int num,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.print("The factorial is: "+fact);
    }
}
