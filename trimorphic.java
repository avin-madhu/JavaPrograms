import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num=0,rem=0,cube=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        num=sc.nextInt();
        cube = num*num*num;
         rem = cube%10;
         if(rem==num){
            System.out.println("The number is trimorphic");
         }
         else{
            System.out.println("The number is not trimorphic");
         }

    }
}
