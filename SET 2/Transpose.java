import java.util.Scanner;
public class Transpose {
    public static void main(String args[])
    {
        int arr[][] = new int[100][100];
        int trans[][] = new int[100][100];
        

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

        System.out.print("The matrix: \n");
        
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             System.out.print(" "+arr[i][j]);
           }
           System.out.print("\n");
        }

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             trans[j][i]=arr[i][j];
           }
        }

        System.out.print("The transpose of the matrix: \n");

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
             System.out.print(" "+trans[i][j]);
           }
           System.out.print("\n");
        }


    }
}
