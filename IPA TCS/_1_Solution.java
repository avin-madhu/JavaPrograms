import java.util.Arrays;

// Check if s is an anagram of t, if yes return True

public class _1_Solution {
    public static void main(String[] args){
        String s = "bob";
        String t = "bbo";

        // approach 1
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(t_array);
        Arrays.sort(s_array);

        if(String.valueOf(t_array).compareTo(String.valueOf(s_array)) == 0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}
