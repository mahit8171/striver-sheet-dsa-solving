package Arrays.Medium;

public class LongestSubarrayEqlSum {
    private static int findSubarr(int[] nums , int target) {
        int n =  nums.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        
        int sum = nums[0] ;
        while (right < n){
            
            while (left <= right && sum > target){
                sum -= nums[left];
                left++;
                
            }
            if (sum == target){
                 maxLen= Math.max(maxLen, right - left + 1);
            }
            right++;

            if( right < n){
                sum += nums[right];
                
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(findSubarr(nums, k));
    }
}
