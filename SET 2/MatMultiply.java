import java.util.Scanner;
public class MatMultiply {
    public static void main(String args[])
    {
        int arr1[][] = new int[100][100];
        int arr2[][] = new int[100][100];
        int Product[][] = new int[100][100];
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
       
        System.out.print("The Product of the matrices is:\n");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             for(int k=0;k<n;k++)
             {
                Product[i][j] += arr1[i][k]*arr2[k][j];
             }
           }
        }

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             System.out.print(" "+Product[i][j]);
           }
           System.out.print("\n");
        }

    }
}
