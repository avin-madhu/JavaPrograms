import java.util.ArrayList;
import java.util.Scanner;

public class stack{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(); // stack

        System.out.println("1. push\n2. pop\n");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if(choice == 1){ // push operation
            System.out.println("\nEnter the number to push: ");
            int element = sc.nextInt();
            arr.add(element);
        }
        else{
            System.out.println("\nEnter the number to pop: ");
            if(arr.isEmpty()){
                System.out.println("The stack is empty!");
            }
            else{
                int element = arr.get(arr.size()-1);
                System.out.println("the element popped is: ");
                System.out.println(element);
            }
            
        }
    }
}