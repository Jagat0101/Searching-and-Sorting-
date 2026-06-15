import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {323, 34, 45, 56,40},
            {23, 56, 89, 67, 90, 12}
        };
        int target = 45;
        int[] ans = search(arr , target); // Format of output is going to be something like [row , col] index
        System.out.println(Arrays.toString(ans));
    }
    // Have to take array return type if we want our output to be of array integer type 
    static int[] search(int[][] arr , int target){
        if(arr.length == 0){
            System.out.println("No elements in array");
        }
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col< arr[row].length; col ++){
                if(arr[row][col] == target){
                    return new int[]{row, col};// creating a new object of int class 
                }
            }
        }
        return new int[]{-1, -1};
    }
}
