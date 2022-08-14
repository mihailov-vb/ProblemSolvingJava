import java.util.Arrays;
import java.util.LinkedHashSet;

public class Array_Array {

	// ********************************************************************************
	// Problem_1_1
	// Получаем массив int, выдаем массив без повторений в том же порядке.
	public static int[] unique1(int[] integers) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i : integers) set.add(i);
		Integer[]arr = set.toArray(new Integer[set.size()]);
		int[]arrr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) arrr[i] = arr[i];
		return arrr;
	}

	// Problem_1_2
	public static int[] unique2(int[] integers) {
		return Arrays.stream(integers).distinct().toArray();
	}

	// ********************************************************************************

	// Problem_2_1




}
