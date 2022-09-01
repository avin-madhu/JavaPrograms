/*this java program takes a number of values from the user in an array and give the largest value entered by th user*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int max=0,a[],num;

        System.out.println("Enter the number of values: ");
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt();
        
        System.out.println("Enter the numbers: ");
       a = new int[num + 1];
        for(int i=0; i<num;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<num;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("the largest number is: "+ max);
    }
}
