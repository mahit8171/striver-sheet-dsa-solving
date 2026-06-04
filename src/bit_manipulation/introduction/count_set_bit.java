package bit_manipulation.introduction;
//Brian Kernighan Algorithm
public class count_set_bit {

    public static void main(String[] args) {

        int n = 13;
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println(count);
    }
}
