package bit_manipulation.introduction;

public class check_power {
    public static void main(String[] args) {
        int num = 8;

        if (num > 0 && (num & (num - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
    }
}
