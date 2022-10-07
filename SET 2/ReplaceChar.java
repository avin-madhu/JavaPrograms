// error code!!!


import java.util.Scanner;
public class ReplaceChar {

       public static void  main(String args[])
       {
        char ch1,ch2;
        int flag=0,pos=0;
        String str = new String();
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print("Enter the character to be replaced");
        ch1 = sc.next().charAt(0);
        System.out.print("Enter the character to replace with");
        ch2 = sc.next().charAt(0);
       
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch1)
            {
              str.replace(ch1 , ch2);
              break;
            }
        }
       
            System.out.println("The new string: "+str);
       }
        
}
