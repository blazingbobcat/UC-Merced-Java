//Josh Klipstein -- Lab Section 1
import java.util.*;
public class Lab06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		int choice = 1;
		int scalar;
		
		while (choice == 1) {
			System.out.println("Please enter coordinates for vector 1: ");
			System.out.println("X: ");
			x = sc.nextInt();
			while (x < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				x = sc.nextInt();
			}
			System.out.println("Y: ");
			y = sc.nextInt();
			while (y < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				y = sc.nextInt();
			}
			System.out.println("Z: ");
			z = sc.nextInt();
			while (z < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				z = sc.nextInt();
			}
			Vector3D v1 = new Vector3D(x, y, z);
			
			System.out.println("Please enter coordinate for vector 2: ");
			System.out.println("X: ");
			x = sc.nextInt();
			while (x < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				x = sc.nextInt();
			}
			System.out.println("Y: ");
			y = sc.nextInt();
			while (y < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				y = sc.nextInt();
			}
			System.out.println("Z: ");
			z = sc.nextInt();
			while (z < 0) {
				System.out.println("Please enter a coordinate 0 or more.");
				z = sc.nextInt();
			}
			Vector3D v2 = new Vector3D(x ,y, z);
			
			System.out.println("Please enter a scalar value to work with: ");
			scalar = sc.nextInt();
			while (scalar <= 0) {
				System.out.println("Please enter a value more than 0.");
				scalar = sc.nextInt();
			}
			
			Vector3D v3 = new Vector3D();
			int[] vector1 = new int[3];
			int[] vector2 = new int[3];
			int[] vector3 = new int[3];
			
			vector1 = v1.toArray(v1);
			vector2 = v2.toArray(v2);
			vector3 = v3.toArray(v3);
			System.out.println("Let's add the vectors: ");
				vector3 = v1.vectorAdd(vector1, vector2);
					v3.toString(vector3);
			System.out.println("Let's subtract the vectors: ");
				vector3 = v1.vectorSubtract(vector1, vector2);
					v3.toString(vector3);
			System.out.println("Let's multiply vector 1 by the scalar.");
				vector3 = v1.scalarMultiply(scalar, vector1);
					v3.toString(vector3);
			System.out.println("Let's multiply vector 2 by the scalar.");
				vector3 = v2.scalarMultiply(scalar, vector2);
					v3.toString(vector3);
			System.out.println("Let's divide vector 1 by the scalar.");
				vector3 = v1.scalarDivide(scalar, vector1);
					v3.toString(vector3);
			System.out.println("Let's divide vector 2 by the scalar.");
				vector3 = v2.scalarDivide(scalar, vector2);
					v3.toString(vector3);
			System.out.println("Let's find the cross product of the two vectors.");
				vector3 = v1.crossProduct(vector1, vector2);
					v3.toString(vector3);
			System.out.println("Let's find the dot product of the two vectors.");
				vector3	= v1.dotProduct(vector1, vector2);
					v3.toString(vector3);
			System.out.println("Would you like to use this program again (Enter 1 for yes)?");
					choice = sc.nextInt();
		} 

	}
}
