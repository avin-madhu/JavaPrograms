import java.util.Scanner;
public class ReplaceEl {
    public static void main(String args[])
    {
        int arr[]= new int[100];
        int num,n,num1;

        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.print("Enter the elements: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the elements to be Replaced: ");
        num=sc.nextInt();
        System.out.print("Enter the elements to Replace: ");
        num1=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(num==arr[i])
            {
                arr[i]=num1;
            }
        }
        System.out.print("The edited array: ");
        for(int i=0;i<n;i++)
        {
         System.out.print(" "+arr[i]);
        }
        


       
        
    }
}
