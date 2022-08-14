public class String_String {

	// ********************************************************************************
	// Problem_1_1
	// Метод заменяет a на b и b на a.
	public static String replace1(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') arr[i] = 'b';
			else if (arr[i] == 'b') arr[i] = 'a';
		}
		return new String(arr);
	}

	// Problem_1_2
	public static String replace2(String x) {
		return x.replace("a", "x").replace("b", "a").replace("x", "b");
	}

	// ********************************************************************************

	// Problem_2_1
	//

}
