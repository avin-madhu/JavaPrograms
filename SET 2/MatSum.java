import java.util.Scanner;
public class MatSum {
    public static void main(String args[])
    {
        int arr1[][] = new int[100][100];
        int arr2[][] = new int[100][100];
        int sum[][] = new int[100][100];
        int n;
        System.out.print("Enter the size of the matrix: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.print("Enter the elements of the first matrix: ");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             arr1[i][j]=sc.nextInt();
           }
        }
        System.out.print("Enter the elements of the second matrix: ");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             arr2[i][j]=sc.nextInt();
           }
        }
       
        System.out.print("The sum of the matrices is:\n");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             sum[i][j]=arr2[i][j]+arr1[i][j];
           }
        }

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             System.out.print(" "+sum[i][j]);
           }
           System.out.print("\n");
        }

    }
}
