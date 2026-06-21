package Arrays.Easy;

public class findMejorityElement {
    private static int findMejority(int[] nums){
        int n = nums.length;
        int cnt = 0;
        int el = 0;
        for(int i = 0; i < n; i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            } else if(nums[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }



        }
        int cnt1 = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] == el){
                cnt1++;
            }
        }
        if(cnt1 > n/2){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,1,3,2,3,1,3,2,3,1,3,3};
        System.out.println(findMejority(arr));
    }
}
