import java.util.Scanner;
public class SearchChar {
 
    public  static void main(String args[])
    {

        char ch;
        int flag=0,pos=0;
        String str = new String();
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print("Enter the character to be searched: ");
        ch = sc.next().charAt(0);
       
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
               flag=1;
               pos =i+1;
            }
        }
        if(flag==1)
        {
            System.out.println("Character found at position "+pos);
        }
        else{
            System.out.println("Character not found !!");
        }
        
    }
}