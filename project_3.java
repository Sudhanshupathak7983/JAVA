import java.util.Scanner;

public class project_3{
    public static void main(String[] args) {
        int seat = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pasanger for stop a to stop b");
        int pasanger_for_a_b= sc.nextInt();
        // rseat shows remaning seat
         int rseat =seat-pasanger_for_a_b;
        if (pasanger_for_a_b>20){
            System.out.println("insufficient seat");
        }
        else {
            System.out.println("sufficient seat" + " " + "rseat" + " =" +rseat);
        }
        System.out.println("enter pasanger for stop a to c");
        int pasanger_for_a_c= sc.nextInt();
        int r1seat = rseat-pasanger_for_a_c;
        if (pasanger_for_a_c>rseat)
        {
            System.out.println("insufficient seat ");

        }
        else {
            System.out.println(" sufficient seat" + "and remaining seat = "+r1seat);
        }
        System.out.println("enter passenger for a to d");

     int    pasanger_for_a_d = sc.nextInt();
        int r2seat = r1seat-pasanger_for_a_d;
        if (pasanger_for_a_d>r1seat)
        {
            System.out.println("insufficient seat ");

        }
        else{
            System.out.println("sufficient seat "+ "and remaining seat  ="+ r2seat);
        }
        System.out.println("now the second stop");

        System.out.println("now total available seat is =" + (rseat+r2seat));
        System.out.println("enter pasanger for b to c");
        int pasanger_for_b_c = sc.nextInt();
        if(pasanger_for_b_c>r2seat){
            System.out.println("no seat available");
        }
        else
        {
            System.out.println(" sufficient seat " + "and remaining seat =  "+( r2seat-pasanger_for_b_c));
        }
        System.out.println("enter passenger for b to d ");
        int pasanger_for_b_d= sc.nextInt();
        if (pasanger_for_b_d>(r2seat-pasanger_for_b_c)){
            System.out.println("no seat aavalible");
        }
        else {
            System.out.println("sufficient seat"+ " "+ "and remaining seat =" +(r2seat+rseat -(pasanger_for_b_d)));
        }
        System.out.println("now the last stop ");
        System.out.println("enter passenger for c to d");
        int pasanger_for_c_d = sc.nextInt();
        if (pasanger_for_c_d>(r2seat-pasanger_for_b_c-(pasanger_for_b_d))){
            System.out.println("insufficient seat");

        }
        else
        {
            System.out.println("remaining seat" +" and remaining seat =" + (pasanger_for_c_d-( pasanger_for_b_d-(r2seat-pasanger_for_b_c))));
        }

        System.out.println("all passenger reached  their destination");
    }
}