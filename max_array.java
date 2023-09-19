import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] array =new int[size];
        int max =array[0];

        for (int i =0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for (int i =0;i<size;i++){
                if(array[i] > max){
                    max = array[i];

            }
        }System.out.println(max);
    }
}
