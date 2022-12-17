import java.lang.Thread;

class t1 extends Thread
{
 public void run()
 {
 
   System.out.print("\n\nEven Numbers\n---------------\n\n");
  for (int i=2;i<=100;i=i+2)
  {
      System.out.print(" "+i);
  }
 }
}

class t2 extends Thread
{
 public void run()
 {
   
   System.out.print("\n\nOdd Numbers\n----------------\n\n");
  for (int i=1;i<100;i=i+2)
  {
      System.out.print(" "+i);
  }
 }
}

public class oddEvenThread
{
 public static void main(String args[]) throws InterruptedException
 {
   t1 odd = new t1();
   t2 even = new t2();
   
   odd.start();
   odd.join();
   even.start();
 }

}
