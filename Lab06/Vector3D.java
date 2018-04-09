//Josh Klipstein -- Lab Section 1
public class Vector3D {
	private int x;
	private int y;
	private int z;
	
	public Vector3D() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vector3D(int vectorX, int vectorY, int vectorZ) {
		x = vectorX;
		y = vectorY;
		z = vectorZ;
	}
	
	public int[] toArray(Object vector) {
		int[] vNew = new int[3];
		vNew[0] = x;
		vNew[1] = y;
		vNew[2] = z;
		return vNew;
		
	}
	
	public int[] vectorAdd(int[] v1, int[] v2) {
		int[] vNew = new int[3];
		vNew[0] = (v1[0] + v2[0]);
		vNew[1] = (v1[1] + v2[0]);
		vNew[2] = (v1[2] + v2[2]);
		return vNew;
	}
	
	public int[] vectorSubtract(int[] v1, int[] v2) {
		int[] vNew = new int[3];
		vNew[0] = (v1[0] - v2[0]);
		vNew[1] = (v1[1] - v2[0]);
		vNew[2] = (v1[2] - v2[2]);
		return vNew;
	}
	
	public int[] scalarMultiply(int scalar, int[] vector) {
		int[] vNew = new int[3];
		vNew[0] = (scalar *  vector[0]);
		vNew[1] = (scalar * vector[1]);
		vNew[2] = (scalar * vector[2]);
		return vNew;
	}
	
	public int[] scalarDivide(int scalar, int[] vector) {
		int[] vNew = new int[3];
		vNew[0] = (vector[0] / scalar);  
		vNew[1] = (vector[1] / scalar);  
		vNew[2] = (vector[2] / scalar);
		return vNew;
	}
	
	public int[] dotProduct(int[] v1, int[] v2) {
		int[] vNew = new int[3];
		vNew[0] = (v1[0] * v2[0]);
		vNew[1] = (v1[1] * v2[0]);
		vNew[2] = (v1[2] * v2[2]);
		return vNew;
	}
	
	public int[] crossProduct(int[] v1, int[] v2) {
		int[] vNew = new int[3];
		vNew[0] = ((v1[1] * v2[2]) - (v2[1] * v1[2])); 
		vNew[1] = ((v1[2] * v2[0]) - (v2[2] * v1[0]));
		vNew[2] = ((v1[0] * v2[1]) - (v2[0] * v1[1]));
		return vNew;
	}

	public void toString (int[] vector)
	{
		System.out.println("\nResultant Vector: " + vector[0] + "î + " + vector[1] +
				"j + " + vector[2] + "k\n");
	}

}
