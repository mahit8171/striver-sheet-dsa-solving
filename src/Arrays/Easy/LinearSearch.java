package Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = search(arr, 5);
        System.out.println(result);


    }
    private static int search(int[] arr, int target) {
        int i ;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
