import java.util.Scanner;

public class if_else_week_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("sunday");
        }
        if (num == 2) {
            System.out.println("monday");
        }
        if (num == 3) {
            System.out.println("monday");
        }
        if (num == 4) {
            System.out.println("wednesday");
        }
        if (num == 5) {
            System.out.println("thurusday");
        }
        if (num == 6) {
            System.out.println("friday");
        }
        if (num==7){
            System.out.println("saturday");
        }

    }
}