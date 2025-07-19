import java.util.Scanner;
public class _4_Solution {

    public static boolean check_vowel(char c){
        char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
        for(char ch: vowels){
            if(ch == c){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int ans = 0;
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();

        // APPROACH 1

        String[] words = given.split(" ");
        for(String word: words){
            if(check_vowel(word.charAt(0))){
                ans += 1;
            }
        }

        if(ans == 0){
            System.out.println("No String Found");
        }
        else{
            System.out.println(ans);
        }
        sc.close();
    }
}
