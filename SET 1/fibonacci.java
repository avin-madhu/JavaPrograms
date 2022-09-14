import java.util.Scanner;

public class fibonacci {
  public static void main(String args[])
  {
    int limit,count=0;
    int first_num=0,second_num=1,result;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    limit = sc.nextInt();
    
    System.out.print(" The fibonacci series is: 0 1");
    while(true)
    {
        result = first_num + second_num;
        count++;

        if(count>=limit)
        {
            break;
        }
        first_num=second_num;
        second_num=result;
        System.out.print(" "+result);
    }
  }   
}
