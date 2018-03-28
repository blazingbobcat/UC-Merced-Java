/* Program to demonstrate integer overflows */
public class IntOverflow {
    // Define the main method
    public static void main(String[] args) {

       // Declare variables
       int i1 = 2147483647, i2 = 1, i3;

       // Calculate and display i3
       i3 = i1 + i2;
       System.out.println(i3);

    }
}
