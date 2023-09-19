import java.util.Scanner;

public class area_of_circle {


    public static void main(String[] args) {
        System.out.println("enter radius ");
        Scanner sc = new Scanner(System.in);
        int radius =sc.nextInt();
        double area = (3.14f*radius*radius);
        System.out.println("area"+area);



    }
}