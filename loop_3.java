import java.util.Scanner;

public class loop_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char c = 'A';

        while(c <= 'Z') {
            System.out.format("%c ", c);
            c++;
        }

    }
}
