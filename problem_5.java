import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
                int quantityA = 200;
                int quantityB = 800;
                int quantityC = 900;
                int priceA = 220;
                int priceB = 980;
                int priceC = 780;
                int totalCost = 0;

        System.out.println("let,s shopping");
                do {
                    System.out.println("quantity of product_1 " + quantityA + " Price of product1" + priceA);
                    System.out.println("quantity of product_2 " + quantityB + " Price of product2" + priceB);
                    System.out.println("quantity of product_3" + quantityC + " Price of product3" + priceC);

                    System.out.print("Enter the quantity of product_1 ");
                    int quantityProduct1 = scanner.nextInt();
                    System.out.print("Enter the quantity of product_2: ");
                    int quantityProduct2 = scanner.nextInt();
                    System.out.print("Enter the quantity of product_3: ");
                    int quantityProduct3 = scanner.nextInt();

                    int costProductA = priceA * quantityProduct1;
                    int costProductB = priceB * quantityProduct2;
                    int costProductC = priceC * quantityProduct3;

                    totalCost += costProductA + costProductB + costProductC;

                    quantityA -= quantityProduct1;
                    quantityB -= quantityProduct2;
                    quantityC -= quantityProduct3;

                    System.out.println("Total Cost: Rs. " + totalCost);

                    System.out.print("Do you want to continue ?(if yes the write yes otherwise type anything ");
                    String continueShopping = scanner.next();

                    if (!continueShopping.equalsIgnoreCase("yes")) {
                        break;
                    }
                } while (true);

                System.out.println("Thank you for shopping Your total amount is Rs " + totalCost);
                System.out.println("Please choose a payment option");
                System.out.println("press 1 for qr code,press 2 for upi");
                int s1 = scanner.nextInt();
                if(s1==1) {
                    System.out.println("done");
                }
                   else if(s1==2) {
                        System.out.println("done");
                    }
                      else{
                        System.out.println("not availabe");

                }

                scanner.close();
            }
        }



//
