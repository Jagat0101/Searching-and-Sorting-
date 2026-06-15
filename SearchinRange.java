public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 78, 92, 1};
        int target = 23;
        int start = 1;
        int end = 5;
        System.out.println(range(arr, target, start, end));
    }
    // Funciton to search for an element in an array in between a given range 
    static int range(int[]arr , int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start ; i <= end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
}
}
