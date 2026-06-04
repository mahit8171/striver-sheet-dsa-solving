package bit_manipulation.introduction;

public class solution {

    public static void main(String[] args) {
        AND_SOLUTION();
        OR_SOLUTION();
        XOR_SOLUTION();
        NOT_SOLUTION();
        LEFT_SHIFT_SOLUTION();
        RIGHT_SHIFT_SOLUTION();

    }
    public static void AND_SOLUTION() {
        int a = 13 ;
        int b = 7;
        System.out.println(a&b);
    }
    public static void OR_SOLUTION() {
        int a = 13 ;
        int b = 7;
        System.out.println(a|b);
    }
    public static void XOR_SOLUTION() {
        int a = 13 ;
        int b = 7;
        System.out.println(a^b);
    }
    public static void NOT_SOLUTION() {
        int a = 13 ;

        System.out.println(~a);
    }
    public static void LEFT_SHIFT_SOLUTION() {
        int a = 13 ;
        System.out.println(a<<1);
    }
    public static void RIGHT_SHIFT_SOLUTION() {
        int a = 13 ;
        System.out.println(a>>1);
    }


}
