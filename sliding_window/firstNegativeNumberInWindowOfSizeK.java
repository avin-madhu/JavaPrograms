import java.util.ArrayList;
import java.util.HashMap;

public class firstNegativeNumberInWindowOfSizeK {
    //  print the first negative integer in each window of size K 
    public static void main(String args[]){
        int[] arr = {-8,2,3,-3,10,-1};
        int k = 4;
        
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0,j=0;
        while(j<arr.length){

            if(j-i+1 > k){
                if(arr[i] < 0){
                    neg.remove(0);
                }
                i+=1;
            }

            if(j-i+1 == k){ // wether the current window size = k 
                if(arr[j]<0){
                    neg.add(arr[j]);
                }
                if(!neg.isEmpty()){
                    ans.add(neg.get(0));
                }
                else{
                    ans.add(0);
                }
            }

            if(arr[j] < 0){
                neg.add(arr[j]);
            }
            j++;
        }

        System.out.println(ans);
    }
}