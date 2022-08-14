public class Long_Long {

	// ********************************************************************************
	// Problem_1_1
	// Выводт длину гипотезы Коллатца (любое натуральное число, может прийти к 1,
	// если четное, то делем на 2, если не четное то умножаем на 3 и прибавляем 1
	public static long conjecture1(long x) {
		long count = 1;
		while (x != 1) {
			if (x % 2 == 0) x = x / 2;
			else x = x * 3 + 1;
			count++;
		}
		return count;
	}

	// Problem_1_2 (ternary operator)
	public static long conjecture2(long x) {
		long count = 1;
		while (x != 1) {
			x = x % 2 == 0 ? x / 2 : x * 3 + 1;
			count++;
		}
		return count;
	}

	// ********************************************************************************

	// Problem_2_1




}
