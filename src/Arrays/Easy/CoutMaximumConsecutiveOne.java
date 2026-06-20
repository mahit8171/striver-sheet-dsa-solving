package Arrays.Easy;

public class CoutMaximumConsecutiveOne {
    public static int Count(int[] nums){
        int count = 0;
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,0 ,1,1,1,1, 0,0,1,1,1,1,1,1,0,0,1,1};
        System.out.println(Count(arr));
    }
}
