package Arrays.Easy;

public class CheckpairsumExist {
    private static boolean checkpairs(int[] arr, int k) {
        int right = arr.length-1;
        int left = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return true;
            }else if (sum < k) {
                left++;
            }
            else {
                right--;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int k = 3;
        System.out.println(checkpairs(arr, k));
    }
}
