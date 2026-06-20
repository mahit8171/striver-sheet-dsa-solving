package Arrays.Easy;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int max = Integer.MIN_VALUE ;
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
