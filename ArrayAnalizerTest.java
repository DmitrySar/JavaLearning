public class ArrayAnalizerTest {
	public static void main(String[] args) throws IndexOfMaxElementException {
		ArrayAnalizer analizer = new ArrayAnalizer();
		int indexOfMaxElement = analizer.getIndexMaxElement(-1, 2, 8, -3, 0);
		int rightRes = 2;
		if (indexOfMaxElement == rightRes) {
			System.out.println("Tested ok");
		} else {
			throw new IndexOfMaxElementException("indexOfMaxElement != " + rightRes);
		}
	}
}
