package bit_manipulation.introduction;

public class check_even_odd {
    public static void main(String[] args) {

        int num = 13;

        if ((num & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
