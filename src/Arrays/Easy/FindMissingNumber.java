package Arrays.Easy;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int sum=0;
        int l=nums.length;
        int total=(l*(l+1))/2;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        return (total-sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNumber(arr));

    }
}
