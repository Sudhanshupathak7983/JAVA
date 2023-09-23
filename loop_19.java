import java.util.Scanner;

public class loop_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        String s;

        switch (n) {
            case 1:
                s = "one";
                break;

            case 2:
                s="two";
                break;

            case 3:
                s="three";
                break;

            case 4:
                s="four";
                break;

            case 5:
                s="five";
                break;

            case 6:
                s="six";
                break;

            case 7:
                s="seven";
                break;

            case 8:
                s="eight";

            case 9:
                s="nine";
                break;

            case 10:
                s="ten";
                break;

            default:
                s = "invalid";
                break;

        }
        System.out.println(s);
    }
}
