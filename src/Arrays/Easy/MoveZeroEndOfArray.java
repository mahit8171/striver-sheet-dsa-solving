package Arrays.Easy;

public class MoveZeroEndOfArray {
    private static void solution(int[] arr){
        int n = arr.length;
        int k = 0;
        for(int i = 0; i < n; i++){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                k = k + 1;


            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,4,0,6,0,8,0,10};
        solution(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
