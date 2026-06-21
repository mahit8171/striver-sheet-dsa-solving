package Arrays.Medium;

public class getSingleElement {
    public int SingleElement(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int num = arr[i];
//            int count = 0;
//
//
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == num)
//                    count++;
//            }
//
//
//            if (count == 1) return num;
//        }
//
//        return -1;

        //Bit manupilation
        int xorr = 0 ;
        for (int i : arr) {
            xorr ^= i;
        }
        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        getSingleElement obj = new  getSingleElement();
        int ans = obj.SingleElement(arr);

        System.out.println("The single element is: " + ans);
    }
}
