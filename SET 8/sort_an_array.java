import java.util.Arrays;

public class sort_an_array {
    public static void main(String args[]){
        int[] arr = {3,2,5,1,4};
        Arrays.sort(arr);

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
