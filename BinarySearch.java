public class BinarySearch{
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int values[] = {1 , 2, 3, 56, 78, 91, 239 , 470};
        int target = 91;
        int ans = binary(values, target);
        System.out.println(ans);

    }

    static int binary(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start+ (end -start)/2;

            if(target < arr[mid]){

                end = mid - 1;

            }else if(target >arr[mid]){

                start = mid + 1;

            }else{

                return mid;
            }
        }
        return -1;

    }
}
