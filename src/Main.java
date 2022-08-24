import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,  "first", "second");

		list.forEach((s -> System.out.println(s))); // одно и то же (вывод коллекции на печать)
		System.out.println();
		list.forEach((System.out::println)); // одно и то же (вывод коллекции на печать)

	}
}
