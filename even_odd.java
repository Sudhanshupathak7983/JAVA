
import javax.swing.*;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {

            System.out.println("num is even ");
        }
        else
        {
            System.out.println("num is odd ");
        }

    }
}
