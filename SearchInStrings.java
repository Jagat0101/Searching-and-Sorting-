import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Jagat";
        char target = 't';
        System.out.println(search2(name, target));
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }


    // Adavanced for loop to search for any char in the string , also called as "For each loop"
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }


    // Function to search if the desried char is there in the string 
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(target == str.charAt(i)){
                return true;

            }
        }
        return false;
    }
}
