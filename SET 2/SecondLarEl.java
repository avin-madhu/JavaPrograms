import java.util.Scanner;
public class SecondLarEl {
    public static void main(String args[])
    {
        int arr[] = new int[100];
        int n;
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)  // sorting the array
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]>arr[i]&&i!=j) 
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.print("The seconf largest nuber is: "+arr[n-2]);
        
        
    }
}
