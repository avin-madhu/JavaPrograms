import java.util.*;
public class ReplaceChar {
    public static void main(String args[])
    {
        String strNew = new String();
        String str = new String();
        char ch,chNew;
           
        Scanner sc = new Scanner(System.in);
           
        System.out.print("Enter the string: ");
        str = sc.nextLine();
           
        System.out.print("Enter the element to replace: ");
        ch = sc.next().charAt(0);
           
        System.out.print("Enter the charcter to be replaced: ");
        chNew = sc.next().charAt(0);
           
        for(int i=0;i<str.length();i++)
        {
            if(ch == str.charAt(i))
            {
                 strNew = str.replace(str.charAt(i), chNew);
            }
        }
           
        System.out.print("The new string is: "+strNew);

    }
}


