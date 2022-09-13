import java.util.Scanner;
public class primeNum {
    public static void main(String args[]){
        int num,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if(num==0||num==1)
        {
            flag=1;
        }
       
        for(int i=2;i<=(num/2);i++)
        {
           if((num%i)==0)
           {
            flag=1;
            break;
           }
        }
        
        if(flag==0)
        {
            System.out.println("Prime number");

        }
        else
        {
            System.out.println("Not a Prime number");
        }
      
    }
}
