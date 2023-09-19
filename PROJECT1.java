import java.util.Scanner;

public class PROJECT1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //everything is in ml here
        int r;
        int x;
        int bottle_weightage=1000;
        System.out.println("enter amount of sugar");
        int sugar = sc.nextInt();
        System.out.println( "left space in bottle" +( bottle_weightage-sugar));
        r=bottle_weightage-sugar;
        System.out.println("enter amount of water");
        int water = sc.nextInt();
        System.out.println("left space in bottle"+(r-water));
        x= r-water;
        System.out.println("enter amount of chemical");
        int chemical = sc.nextInt();
        System.out.println("left space in bottle"+ (x-chemical));
        if (1000-(sugar+chemical+water)>0){
            System.out.println("please full bottle");
        }

    }
}
