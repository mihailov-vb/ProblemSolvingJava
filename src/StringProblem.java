import java.util.TreeSet;

public class StringProblem {

	/**
	 * Problem_1_1 (удивительно, но лучше решения не увидел)
	 * Если вторая переданная строка являеться окончанием первой, то True, иначе False
	 *
	 * @param str    передаваемая строка на проверку
	 * @param ending проверяемое окончание, является ли окончанием str
	 * @return являеться ли второй параметр окончанием переданной строки
	 */
	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}

	/**
	 * Problem_2_1
	 * Подсчитывает гласные буквы в переданной строке
	 *
	 * @param str передаваемая строка для подсчета гласных букв
	 * @return количество гласных букв
	 */
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

	/**
	 * Problem_2_2
	 * Подсчитывает гласные буквы в переданной строке
	 *
	 * @param str передаваемая строка для подсчета гласных букв
	 * @return количество гласных букв
	 */
	public static int getCount2(String str) {
		return str.replaceAll("(?i)[^aeiou]", "").length();
	}

	/**
	 * Problem_2_3
	 * Подсчитывает гласные буквы в переданной строке
	 *
	 * @param str передаваемая строка для подсчета гласных букв
	 * @return количество гласных букв
	 */
	public static int getCount3(String str) {
		return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	}

	/**
	 * Problem_3_1 Метод заменяет a на b и b на a.
	 *
	 * @param str в переданной строке, производиться замена букв a на b и b на a
	 * @return строка с замененными буквами
	 */
	public static String replace1(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') arr[i] = 'b';
			else if (arr[i] == 'b') arr[i] = 'a';
		}
		return new String(arr);
	}

	/**
	 * Problem_3_2 Метод заменяет a на b и b на a.
	 *
	 * @param str в переданной строке, производиться замена букв a на b и b на a
	 * @return строка с замененными буквами
	 */
	public static String replace2(String str) {
		return str.replace("a", "x")
				.replace("b", "a")
				.replace("x", "b");
	}

	/**
	 * Problem_4_1 Получаем две строки. Объеденяем их. Убираем повторяющиеся символы. Сортируем. Выводим новую строку
	 *
	 * @param s1 первая строка
	 * @param s2 вторая строка
	 * @return строка, результат объеденения s1 и s2, отсортированная и без повторений
	 */
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

	/**
	 * Problem_4_2 Получаем две строки. Объеденяем их. Убираем повторяющиеся символы. Сортируем. Выводим новую строку
	 *
	 * @param s1 первая строка
	 * @param s2 вторая строка
	 * @return строка, результат объеденения s1 и s2, отсортированная и без повторений
	 */
	public static String longest2(String s1, String s2) {
		String s = s1 + s2;
		return s.chars().distinct()
				.sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}

	/**
	 * Problem_4_3 Получаем две строки. Объеденяем их. Убираем повторяющиеся символы. Сортируем. Выводим новую строку
	 *
	 * @param s1 первая строка
	 * @param s2 вторая строка
	 * @return строка, результат объеденения s1 и s2, отсортированная и без повторений
	 */
	public static String longest3(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		(s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
		return sb.toString();
	}

	/**
	 * Problem_4_4 Получаем две строки. Объеденяем их. Убираем повторяющиеся символы. Сортируем. Выводим новую строку
	 *
	 * @param s1 первая строка
	 * @param s2 вторая строка
	 * @return строка, результат объеденения s1 и s2, отсортированная и без повторений
	 */
	public static String longest4(String s1, String s2) {
		String all = "abcdefghijklmnopqrstuvwxyz";
		return all.replaceAll("[^" + s1 + s2 + "]", "");
	}


}
