package bit_manipulation.introduction;

public class check_solution {
    public static void main(String[] args) {
        CHECK_SET_SOLUTION(2 , 13);
        SET_iTH_BIT(13 ,1);
        CLEAR_iTH_BIT(13 , 2);
        toggle_ith_bit(13 , 0);
    }
    public static void CHECK_SET_SOLUTION(int i , int num){
//        int num = 13; //1101
//        int i = 2;

        if ((num & (1 << i)) != 0) {
            System.out.println("Bit is Set");
        } else{
            System.out.println("Bit is Not Set");
        }
    }
    public static void SET_iTH_BIT(int num , int i){
//        int num = 13;
//        int i = 1;

        int result = num | (1 << i);

        System.out.printf("set ith bit: %d\n", result);
    }
    public static void CLEAR_iTH_BIT(int num , int i){
//        int num = 13;
//        int i = 2;

        int result = num & ~(1 << i);

        System.out.printf("clear ith bit output %d \n", result);
    }
    public static void toggle_ith_bit(int num , int i){
//        int num = 13;
//        int i = 0;

        int result = num ^ (1 << i);

        System.out.printf("toggle ith bit output %d \n", result);
    }
}
