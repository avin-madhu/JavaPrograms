import java.util.Scanner;
public class SumofNnum {
 
    public static void main(String args[])
    {
       int n,sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of terms: ");
       n=sc.nextInt();
     
       for(int i=1;i<=n;i++)
       {
        sum+=i;
       }
       System.out.println("The sum is "+ sum);
    }
}
