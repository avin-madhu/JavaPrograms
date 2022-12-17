import java.io.*;
import java.util.*;
class tokenizer
{
public static void main(String args[]) throws IOException
{
byte array[]= new byte[75];
int x,sum=0;
FileInputStream f = new FileInputStream("numbers.txt");
f.read(array);
String numbers = new String(array);
StringTokenizer st = new StringTokenizer(numbers, " ");
System.out.print("The numbers from file are : ");
while(st.hasMoreTokens())
{
x=Integer.parseInt((st.nextToken()).trim());
System.out.print(x+" ");
sum+=x;
}
System.out.print("\n The sum is "+ sum);
}
}

// OUTPUT

// The numbers from file are : 12 14 3 1 8 7 11 17
// The sum is 73