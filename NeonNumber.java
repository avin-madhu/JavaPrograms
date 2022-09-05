/*NEON NUMBER

When the square of the digits of a number is equal to the number itself,
the number is said to be neon number.
1 and 9 are considered to be neon numbers among the single-digit-numbers.*/ 
import java.util.Scanner; 
public class Main{
    public static void main(String[] args){
     int num=0,rem=0,neon=0;
     System.out.println("Enter the number: ");
     Scanner sc = new Scanner(System.in);
     num=sc.nextInt();
     neon=num;

     if(num==1||num==9)
     {
        System.out.println("Neon number");
     }
    else{
     while(num!=0)
     {
       rem=num%10;
       num=(rem*rem)+num;
       num=num/10;
     }
    
     if(num==neon)
     {
        System.out.println("Neon number");
     }
     else{
        System.out.println("Not a neon number");
     }
   }
    }
}
