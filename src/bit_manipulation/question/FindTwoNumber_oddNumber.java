package bit_manipulation.question;

public class FindTwoNumber_oddNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5 ,2};
        FindTwoNumber_oddNumber obj = new FindTwoNumber_oddNumber();
        int[] ans = obj.singlenumber(nums);
        System.out.println("The single numbers in given array are: " + ans[0] + " and " + ans[1]);

    }
    public int[]singlenumber(int[] arr) {
        int n = arr.length;
        // Variable to store XOR size of all elements
        long XOR = 0;

        //Traverse the array
        for (int i = 0; i < n; i++) {
            //Update the XOR
            XOR ^= arr[i];
        }
        /* Variable to get the rightmost
         set bit in overall XOR
         that means all bit are remove and leave only rightmost
         set bit of original number
         */
        int rightmost = (int)(XOR & (XOR -1))^(int)XOR;

        /* Variables to stores XOR of
        elements in bucket 1 and 2 */
        int XOR1 = 0 , XOR2 = 0 ;
        // Traverse the array
        for (int i = 0; i < n; i++) {
            /*
            Divide the number among
            the bucket 1 and 2 based on rightmost set bit
            * */

            if((arr[i] & rightmost) != 0){
                XOR1 ^= arr[i];

            }else {
                XOR2 ^= arr[i];
            }

        }
        //return the result in  sorted order
        if(XOR1 < XOR2) return new int[]{XOR1,XOR2};
        else return new int[]{XOR2,XOR1};


    }
}
