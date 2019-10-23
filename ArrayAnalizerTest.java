public class ArrayAnalizerTest {
	public static void main(String[] args) {
		ArrayAnalizer analizer = new ArrayAnalizer();
		int indexOfMaxElement = analizer.getIndexMaxElement(-1, 2, 8, -3, 0);
		System.out.println("index of max element: " + indexOfMaxElement);
		System.out.println("Tested is " + (indexOfMaxElement == 2));
	}
}
