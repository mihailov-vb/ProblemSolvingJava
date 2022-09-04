import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,  "first", "second");

		list.forEach((s -> System.out.println(s))); // одно и то же (вывод коллекции на печать)
		System.out.println();
		list.forEach((System.out::println)); // одно и то же (вывод коллекции на печать)

		String str = "1 2 3 4 5 6 7 8";

		System.out.println(StringProblem.highAndLow(str));
	}

	// test 3
}
