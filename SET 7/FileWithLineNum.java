import java.io.*;
public class FileWithLineNum
{
  public static void main(String args[]) throws IOException
  {
   FileInputStream F = new FileInputStream("CharFreq.java");
   int i =1,ch;
   System.out.print(i+"=>");
   
   while((ch=F.read())!=-1)
   {
     System.out.print((char)ch); // type casted ouput
     if(ch=='\n')
     System.out.print("\n"+ ++i+"=>");  
   }
   F.close();
  }
}
