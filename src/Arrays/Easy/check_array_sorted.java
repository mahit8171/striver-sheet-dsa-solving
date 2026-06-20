package Arrays.Easy;

public class check_array_sorted {
    public static void main(String[] args) {
        int[] arr = {1 ,4, 6,7,4,7,8,53,2};
        System.out.println(isSorted(arr));

    }
    private static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
