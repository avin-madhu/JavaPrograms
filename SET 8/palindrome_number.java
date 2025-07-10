import java.lang.*;

class functions {
    boolean palindrome_number_check(int num){
         if(num < 0){
            return false;
        }
        else{
            String num_string = String.valueOf(num);
            StringBuilder sb = new StringBuilder(num_string);
            String num_rev_string = sb.reverse().toString();
            System.out.println(num_rev_string);
            if(num_string.compareTo(num_rev_string) == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

public class palindrome_number {
    public static void main(String[] args) {
        functions obj = new functions();
        obj.palindrome_number_check(123);
    }
}
