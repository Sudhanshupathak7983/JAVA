import javax.swing.*;
import java.util.Scanner;

public class loop_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number;");
        int n = sc.nextInt();
        int first;
        int last;
        last = n%10;
        first=n;
        while(first>=10){
            first=first/10;
        }
        System.out.println("first number is"+ first);
        System.out.println("first number is"+ last);
        int sum =first+last;
        System.out.println(sum);

    }
}
