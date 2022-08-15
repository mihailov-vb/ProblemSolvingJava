import java.util.*;

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
		return x.replace("a", "x")
				.replace("b", "a")
				.replace("x", "b");
	}

	// ********************************************************************************

	// Problem_2_1
	// Получаем две строки. Объеденяем их. Убираем повторяющиеся символы. Сортируем. Выводим новую строку
	public static String longest1(String s1, String s2) {
		TreeSet<Character> set = new TreeSet<>(); // создаем пустой Set

		String str = s1.concat(s2); // объеденили строки
		char[] arr = str.toCharArray(); // передали в массив симолов объедененную стрку

		for (char c : arr) set.add(c); // перебираем массив и добавляем в set
		// в set остаються только уникальные Character

		StringBuilder builder = new StringBuilder(set.size());
		for (Character c : set) builder.append(c);

		return builder.toString();
	}

	// Problem_2_2
	public static String longest2(String s1, String s2) {
		String s = s1 + s2;
		return s.chars().distinct()
				.sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}

	// Problem_2_3
	public static String longest3(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		(s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
		return sb.toString();
	}

	// Problem_2_4
	public static String longest (String s1, String s2) {
		String all = "abcdefghijklmnopqrstuvwxyz";
		return all.replaceAll("[^" + s1+s2 + "]", "");
	}

	// ********************************************************************************

	// Problem_3_1
	//

}
