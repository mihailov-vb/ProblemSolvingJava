import static java.util.Arrays.stream;

public class Array_String {

	// ********************************************************************************
	// Problem_1_1
	// Получаем массив, если сумма четная то выводим "even" или наоборот "odd"
	public static String oddOrEven1(int[] array) {
		int count = 0;
		if (array == null) return "even";
		for (int i : array) count += i;
		return count % 2 == 0 ? "even" : "odd";
	}

	// Problem_1_2

	public static String oddOrEven2(final int[] array) {
		return stream(array).sum() % 2 == 0 ? "even" : "odd";
	}

	// ********************************************************************************

	// Problem_2_1
	//
	//


}