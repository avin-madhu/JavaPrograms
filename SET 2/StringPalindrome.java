import java.util.Scanner;
public class StringPalindrome {
 
    public  static void main(String args[])
    {
        int flag=0;
        String str = new String();
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
       
        for(int i=0, j=str.length()-1;i<str.length()&&j>=0;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
               flag =1;
            }
        }
        if(flag==0)
        {
            System.out.print("The string is a palindrome.");
        }
        else
        {
            System.out.print("The string is not a palindrome.");
        }

    }
}
