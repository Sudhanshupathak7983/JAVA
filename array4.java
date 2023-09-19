import java.util.Scanner;

public class array4{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int[] array = new int [size];
      int sum = 0;
      System.out.println("Enter elements ");

      for(int i=0; i<size; i++){
         array[i] = s.nextInt();
         sum = sum + array[i];
      }
      System.out.println("Sum ="+sum);
   }
}