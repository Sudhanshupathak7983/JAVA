
    import java.util.Arrays;
    public class array_5
    {
        public static void main(String[] args)
        {
//defining an array of integer type
            int [] array = new int [] {3,5,1,7,2,3,5,9};
//invoking sort() method of the Arrays class
            Arrays.sort(array);
            System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
        }

}
