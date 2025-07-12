import java.util.ArrayList;
import java.util.HashMap;

public class GetTheAnagrams {

    public static boolean isSame(HashMap<Character,Integer> TargetWindow, HashMap<Character,Integer> CurrentWindow ){
        for (char key : TargetWindow.keySet()) {
            if (!CurrentWindow.containsKey(key) || !CurrentWindow.get(key).equals(TargetWindow.get(key))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "forxxorfxdofr";
        String str2 = "for";
        ArrayList<String> ans = new ArrayList<>();

        int windowSize = str2.length();

        HashMap<Character, Integer> TargetWindow = new HashMap<>();
        for(char ch: str2.toCharArray()){
            TargetWindow.put(ch, TargetWindow.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> CurrentMap  = new HashMap<>();

        int i = 0;
        for(int j=0;j<str1.length();j++){

            char ch = str1.charAt(j);
            CurrentMap.put(ch,CurrentMap.getOrDefault(ch,0)+1);
            // System.out.println(CurrentMap);

            if(j-i + 1> windowSize){ // window shrinking logic
                CurrentMap.put(str1.charAt(i), CurrentMap.get(str1.charAt(i))-1);
                i+=1;
            }
            
            if(j-i+1 == windowSize && isSame(TargetWindow, CurrentMap)){
                ans.add(str1.substring(i,j+1));
            }
        }
        System.out.println("\nThe anagrams in the str1 are: \n");
        for(String a: ans){
                System.out.println(a);
        }
    }
    
}
