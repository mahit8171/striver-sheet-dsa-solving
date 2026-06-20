package Arrays.Easy;

public class rotate_kth_place {
    private  static void solution(int[] arr ,int k ,String direction){

        int n = arr.length;
        k=k%n;
        if(n==0 || k==0){
            return;
        }
        if(direction.equals("right")){
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }
        else if(direction.equals("left")){
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);

        }
    }
    private static void reverse(int[] arr ,int str ,int end){
        while(str<end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String direction = "right";
        int k = 34;
        solution(arr,k,direction);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
