import java.util.HashMap;
import java.util.HashSet;

public class minWindowString {
    public static boolean check(HashMap<Character, Integer> window){
        for(char key: window.keySet()){
            if(window.get(key) <= 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "ADOBECODEBANC ";
        String t = "ABC"; // output BANC of size 4 ( it contains all character of t )
        String ans = "";
        int i = 0, j = 0;
        int min_size = s.length();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char ch: t.toCharArray()){
            window.put(ch,0);
        }

        while(j < s.length()){
            char ch = s.charAt(j);
            if(window.containsKey(ch)){
                window.put(ch,window.get(ch)+1);
            }
            // System.out.println(window);
            while(check(window)){
                if(min_size > j-i+1){
                    min_size = j - i +1;
                    ans = s.substring(i,j+1);
                }

                ch = s.charAt(i);
                if(window.containsKey(ch)){
                    window.put(ch,window.get(ch)-1);
                }
                i++;
            }
            j++;
        }

        System.out.println(min_size);
        System.out.println(ans);
    }
}
