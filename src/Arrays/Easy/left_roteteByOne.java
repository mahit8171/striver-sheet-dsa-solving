package Arrays.Easy;

public class left_roteteByOne {
    public static void solution(int[] nums){
        int tem = nums[0];
        for(int i = 1; i <  nums.length  ; i++  ){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = tem;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solution(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
