import java.util.Scanner;
public class even_using_for_loop {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
