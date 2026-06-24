public class agonistic{
    public static void main(String[] args) {
        int[] search = { 1 , 2 ,3,4,67, 89, 90, 123,};
        int[] search2 = {89, 79, 69, 56, 34, 12, 1, 0, -1, -2};
        int tg = 89;
        int tg2 = 0;
        int ans = binary(search, tg);
        int ans2 = binary(search2, tg2);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int binary(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean ifAgo = arr[start] < arr[end];
        //if(arr[start] < arr[end]){
            //ifAgo = true;
        //}
        //else{
          //  ifAgo = false;
        //}
        while(start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
            return mid;
        }
        if(ifAgo){
            if(target < arr[mid]){

                end = mid - 1;

            }else{

                start = mid + 1;

            }
        }else{
            if(target > arr[mid]){

                end = mid - 1;

            }else{

                start = mid + 1;

            }
        }
        }
        


        return -1;

    }
}