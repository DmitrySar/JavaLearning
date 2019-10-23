
import java.util.*;

public class ArrayAnalizer {
	
	public int getIndexMaxElement(int ... array) {
		int[] tmpArray = Arrays.copyOf(array, array.length);
		Arrays.sort(tmpArray);
		return Arrays.binarySearch(array, tmpArray[tmpArray.length-1]);
	}
}
