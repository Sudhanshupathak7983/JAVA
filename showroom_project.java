
import java.util.Scanner;
public class showroom_project {
    public static void main(String[] sudhanshu) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your choice if  you want 2 wheelers type 2v and for 4 type or 4v");
        String a = sc.next();

        if (a.equals("4v")) {
            System.out.println("user has select 4 whe");
        }
        if (a.equals("2v")) {
            System.out.println("user has select 2 whe");
        }
        //Scanner sc= new Scanner(System.in);
        System.out.println("enter compony");
        String c = sc.next();
        if (c.equals("tata")||c.equals("mahindra")||c.equals("scorpio")) {
            System.out.println("user car has been selected ");





        System.out.println("enter color");
        String d = sc.next();
        if(d.equals("black")||d.equals("blue")||d.equals("yellow"))
        {
            System.out.println( "user color is in stock");

        }
        else
        {
            System.out.println("not in stock");
        }

        }
        else {
            System.out.println("invalid ");
        }
        System.out.println("your oreder had been selected");
    }
}
























