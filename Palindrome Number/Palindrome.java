
public class Palindrome {

    public static boolean Palindrome_Number(int num) {

        if (num < 0) {
            return (false);
        }

        int target = num;

        int total = 0;

        while (target > 0) {
            int num0 = target % 10;
            total = total * 10 + num0;
            target = target / 10;
        }

        return (total == num);
    }

    public static void main(String[] args) {

        boolean res = Palindrome.Palindrome_Number(113141);
        System.out.println(res);

    }
}
