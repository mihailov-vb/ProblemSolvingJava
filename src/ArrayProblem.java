import java.util.Arrays;
import java.util.LinkedHashSet;

import static java.util.Arrays.stream;

public class ArrayProblem {

	/**
	 * Problem_1_1
	 * Получаем массив int, выдаем массив без повторений в том же порядке.
	 * @param integers из передаваемого массива, убираються повторении
	 * @return возвращается массив без повторений
	 */
	public static int[] unique1(int[] integers) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i : integers) set.add(i);
		Integer[]arr = set.toArray(new Integer[set.size()]);
		int[]arrr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) arrr[i] = arr[i];
		return arrr;
	}

	/**
	 * Problem_1_2
	 * Получаем массив int, выдаем массив без повторений в том же порядке.
	 * @param integers из передаваемого массива, убираються повторении
	 * @return возвращается массив без повторений
	 */
	public static int[] unique2(int[] integers) {
		return Arrays.stream(integers).distinct().toArray();
	}

	/**
	 * Problem_2_1
	 * Получаем массив, если сумма четная то выводим "even" или наоборот "odd"
	 * @param array подсчитывается сумма из данного массива
	 * @return выводиться "even" если четное или "odd" если не четное
	 */
	public static String oddOrEven1(int[] array) {
		int count = 0;
		if (array == null) return "even";
		for (int i : array) count += i;
		return count % 2 == 0 ? "even" : "odd";
	}

	/**
	 * Problem_2_2
	 * Получаем массив, если сумма четная то выводим "even" или наоборот "odd"
	 * @param array подсчитывается сумма из данного массива
	 * @return выводиться "even" если четное или "odd" если не четное
	 */
	public static String oddOrEven2(final int[] array) {
		return stream(array).sum() % 2 == 0 ? "even" : "odd";
	}

	/**
	 * Problem_3_1
	 * Получает массив символов, возвращает наименьшее занчение или индекс наименьшее значение
	 * @param numbers поиск наименьшего значения в данном массиве
	 * @param toReturn параметр возвращаемого значения
	 * @return возвращает в зависимости от toReturn или наименьшее занчение или индекс наименьшего значения
	 */
	public static int findSmallest( final int[] numbers, final String toReturn ) {
		int min = numbers[0];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) if (numbers[i] < min) {
			min = numbers[i];
			index = i;
		}
		return toReturn.equals("value") ? min : index;
	}

}
