public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1,2,3};
        int target = 23;
        int ans = linear(nums, target);
        System.out.println(ans);
    }
    // Making a function to execute linear search , if value is found return index or else return null 
    static int linear(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
