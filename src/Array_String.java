import java.lang.reflect.Array;

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
	// Получает массив символов, возвращает наименьшее занчение по индексу или номеры
	public static int findSmallest( final int[] numbers, final String toReturn ) {
		int min = numbers[0];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) if (numbers[i] < min) {
			min = numbers[i];
			index = i;
		}
		return toReturn.equals("value") ? min : index;
	}

	// ********************************************************************************
	// Problem_3_1

}