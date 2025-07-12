import java.lang.Math;
public class shortestSubarraySum{
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int i = 0;
        int current_sum  = 0;
        int min_size = arr.length;

        for(int j=0;j<arr.length;j++){
            current_sum += arr[j];
            while(current_sum >= target){
                min_size = Math.min(min_size,j-i+1);
                current_sum -= arr[i];
                i++;
            }
        }

        System.out.println(min_size);
    }
}