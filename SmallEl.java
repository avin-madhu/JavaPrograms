import java.util.Scanner;
public class SmallEl {
    public static void main(String arg[])
    {
        int arr[] = new int[100];
        int n,small=0;
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
           for(int j=0;j<n-i;j++)
           {
             
           }
        }
       
        System.out.print("The smallest Element is: "+ small);

    }
}
