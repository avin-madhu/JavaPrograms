// read an integer

import java.util.Scanner;
public class _3_Solution{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int odd_count = 0;
        int res = 0;

        String num_string = String.valueOf(num);
        for(char ch: num_string.toCharArray()){
            if(Integer.valueOf(ch)%2 == 1){
                odd_count += 1;
            }
            if(odd_count >= 3){
                res = 1;
                break;
            }
        }
        if(res == 1) System.out.println("TRUE");
        else System.out.println("FALSE");
        sc.close();
    }
}
