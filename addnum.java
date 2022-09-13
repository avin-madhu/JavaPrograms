import java.util.Scanner;

public class addnum {
    public static void main(String args[]){

        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();

        sum=num1+num2;
        System.out.println("The sum is: "+ sum);
        
    }
}
