import java.util.Scanner;
public class LargestMatEl{
    public static void main(String args[])
    {
        int arr[][] = new int[100][100];
        int n;
        System.out.print("Enter the size of the matrix: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.print("Enter the elements of the matrix: ");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             arr[i][j]=sc.nextInt();
           }
        }
        int big = arr[0][0];
        for(int i=0;i<n;i++)
        {
           for(int j=1;j<n;j++)
           {
             if(big<arr[i][j])
             {
                big = arr[i][j];
             }
           }
        }
        
        System.out.print("The matrix: ");
        System.out.print("\n");
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             System.out.print(" "+arr[i][j]);
           }
           System.out.print("\n");
        }
        System.out.print("The Largest element is: "+big);
    }
}
