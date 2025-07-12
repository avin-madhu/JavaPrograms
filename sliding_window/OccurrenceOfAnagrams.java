import java.util.HashMap;

public class OccurrenceOfAnagrams {

    public static boolean isSame(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        if (map1.size() != map2.size()) return false;
        for (char key : map1.keySet()) {
            if (!map2.containsKey(key) || !map2.get(key).equals(map1.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "forxxorfxdofr";
        String str2 = "for";
        int ans = 0;

        int windowSize = str2.length();

        // Frequency map for str2
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char ch : str2.toCharArray()) {
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }

        // Frequency map for current window
        HashMap<Character, Integer> windowMap = new HashMap<>();

        int i = 0;
        for (int j = 0; j < str1.length(); j++) {
            // Add character to window
            char ch = str1.charAt(j);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            // Shrink window if it exceeds size
            if (j - i + 1 > windowSize) {
                char removeChar = str1.charAt(i);
                windowMap.put(removeChar, windowMap.get(removeChar) - 1);
                if (windowMap.get(removeChar) == 0) {
                    windowMap.remove(removeChar);
                }
                i++;
            }

            // Check if current window is an anagram
            if (j - i + 1 == windowSize && isSame(targetMap, windowMap)) {
                ans++;
            }
        }

        System.out.println("Number of anagram occurrences: " + ans);
    }
}
