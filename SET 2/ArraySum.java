import java.util.Scanner;
public class ArraySum{

    public static void main(String args[])
    {
        int arr[] = new int[100];
        int n,sum=0;
        System.out.print("Enter the number of elements: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        System.out.print("The sum is: "+ sum);

    }
}