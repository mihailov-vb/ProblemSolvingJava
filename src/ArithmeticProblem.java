import java.util.stream.Stream;

/**
 * Класс для решения проблем связанных с Arithmetic
 */
public class ArithmeticProblem {

	/**
	 * Problem_1_1 Выводт длину гипотезы Коллатца
	 * <p>
	 * Дюбое натуральное число, может прийти к 1.
	 * Если четное, то делем на 2, если не четное то умножаем на 3 и прибавляем 1
	 *
	 * @param x число для определения количества длины гипотезы Коллатца
	 * @return длину гипотезы Коллатца
	 */
	public static long conjecture1(long x) {
		long count = 1;
		while (x != 1) {
			if (x % 2 == 0) x = x / 2;
			else x = x * 3 + 1;
			count++;
		}
		return count;
	}

	/**
	 * Problem_1_2 Выводт длину гипотезы Коллатца (решение через тернарный оператор)
	 * <p>
	 * Дюбое натуральное число, может прийти к 1.
	 * Если четное, то делем на 2, если не четное то умножаем на 3 и прибавляем 1
	 *
	 * @param x число для определения количества длины гипотезы Коллатца
	 * @return длину гипотезы Коллатца
	 */
	public static long conjecture2(long x) {
		long count = 1;
		while (x != 1) {
			x = x % 2 == 0 ? x / 2 : x * 3 + 1;
			count++;
		}
		return count;
	}

	/**
	 * Problem_2_1 (google) Возвращает n-ый элемент последовательности фибоначи
	 *
	 * @param n номер последовательности последовательности фибоначи
	 * @return значение последовательности последовательности фибоначи
	 */
	public static long fib1(int n) {
		long n0 = 1;
		long n1 = 1;
		long n2 = 1;

		for (long i = 3; i <= n; i++) {
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
		return n2;
	}

	/**
	 * Problem_2_2 (recursion) Возвращает n-ый элемент последовательности фибоначи
	 *
	 * @param n номер последовательности последовательности фибоначи
	 * @return значение последовательности последовательности фибоначи
	 */
	public static long fib2(int n) {
		if (n <= 1) {
			return n;
		}
		return fib2(n - 1) + fib2(n - 2);
	}

	/**
	 * Problem_2_2 (stream) Возвращает n-ый элемент последовательности фибоначи
	 *
	 * @param n номер последовательности последовательности фибоначи
	 * @return значение последовательности последовательности фибоначи
	 */
	public static long fib3(int n) {
		return Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[0] + i[1]})
				.limit(n)
				.reduce((x, y) -> y)
				.get()[0];
	}


}
