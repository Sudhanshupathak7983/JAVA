import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int sum =0;
        while (n != 0) {

            n /= 10;
            ++c;
            sum += c;
        }

        System.out.println(sum);
        System.out.println(c);
    }
}
