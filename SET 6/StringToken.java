import java.util.*;
import java.io.*;
public class StringToken
{
  public static void main(String args[])throws IOException
  {
    FileInputStream F = new FileInputStream("IntegerNum.txt");
    byte b[] = new byte[500];
    F.read(b);
    String d = "\t\n\0";
    String str = new String(b);
    StringTokenizer nums = new StringTokenizer(str,d);
    int sum=0;
    int num;
    while(nums.hasMoreTokens())
    {
     try 
     {
     num = Integer.parseInt(nums.nextToken());
     System.out.println(num);
     sum+=num;
     }
     catch(NumberFormatException e)
     {
          ;    
     }
    }
    System.out.print("The sum is: "+sum);
    
  }
}






/*import java.io.*;
import java.util.StringTokenizer;

class FileSum
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream F = new FileInputStream("misc.txt");
		byte chars[] = new byte[100];
		
		F.read(chars);
		
		String nums = new String(chars);
		String delim = " \n\t\0";
		StringTokenizer tokenizer = new StringTokenizer(nums, delim);
		
		int n;
		int sum = 0;
		
		System.out.println(" Numbers in the file are");
		System.out.println("-------------------------");
		while (tokenizer.hasMoreTokens())
		{
			try
			{
				n = Integer.parseInt(tokenizer.nextToken());
				System.out.println(n);
				sum += n;
			}
			catch (NumberFormatException error)
			{
				;  // If non integer characters present in file, ignore it
			}
		}
			
		System.out.println();
		System.out.println("Sum is: " + sum);
	}
}




















