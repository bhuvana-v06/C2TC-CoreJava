package Day10_Arrays;

public class MultiDimArrayDemo {
	public static void main(String[] args) {

		int c[][] = { { 12, 45 }, { 10, 40 }, { 5, 7 } }; // new int[3][2];

		System.out.println("No. of Rows in C array : " + c.length);
		System.out.println("No. of Columns in C array : "+ c[0].length);

		MLArray.printArray(c);
	}

}
