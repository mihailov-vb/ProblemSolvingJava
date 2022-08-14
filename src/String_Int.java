public class String_Int {

	// ********************************************************************************
	// Problem_1_1
	// Подсчитывает гласные буквы в переданной строке
	public static int getCount1(String str) {
		int count = 0;
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	// Problem_1_2
	public static int getCount2(String str) {
		return str.replaceAll("(?i)[^aeiou]", "").length();
	}

	// Problem_1_3
	public static int getCount3(String str) {
		return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	}

	// ********************************************************************************

	// Problem_2_1
	//
}
