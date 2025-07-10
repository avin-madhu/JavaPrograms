import java.util.HashMap;

// 

public  class frequency_in_string{
    public static void main(String args[]){
        String name = "banana";
        HashMap<Character,Integer> map = new HashMap<>(); // this is how you declare a Hashmap

        for(int i=0;i<name.length();i++){
            if(map.containsKey(name.charAt(i))){
                map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
            }
            else{
                map.put(name.charAt(i),1);
            }
        }
        for(char key: map.keySet()){
            System.out.print(key + " has a frequency of ");
            System.out.println(map.get(key));
        }
        
    }
}