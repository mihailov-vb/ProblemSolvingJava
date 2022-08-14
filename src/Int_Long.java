import java.util.stream.Stream;

public class Int_Long {

	// ********************************************************************************
	// Problem_1_1 (google)
	// Возвращает n-ый элемент последовательности фибоначи
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

	// Problem_1_2 (recursion)
	public static long fib2(int n) {
		if (n <= 1) {
			return n;
		}
		return fib2(n - 1) + fib2(n - 2);
	}

	// Problem_1_3 (stream)
	public static long fib3 (int n){
		return Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[0] + i[1]})
				.limit(n)
				.reduce((x, y) -> y)
				.get()[0];
	}

	// ********************************************************************************

	// Problem_2_1


}
