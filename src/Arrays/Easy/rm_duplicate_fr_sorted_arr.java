package Arrays.Easy;

public class rm_duplicate_fr_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,3, 3, 4,4,4,5, 5, 6,6,6,6,7, 7, 8, 9};
        int last = solution(arr);
        for(int i=0;i<last;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static int solution(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++ ;
                arr[i] = arr[j];

            }
        }
        return i+1;
    }
}
