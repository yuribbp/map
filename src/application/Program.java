package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		System.out.println("ALL COOKIES BEFORE:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println();
		System.out.println("Size: " + cookies.size());

		cookies.remove("email");
		cookies.put("phone", "99711133"); //SOBRESCREVE NOVO VALOR

		System.out.println();
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

		System.out.println();
		System.out.println("Phone number: " + cookies.get("phone"));

		System.out.println();
		System.out.println("Email: " + cookies.get("email"));

		System.out.println();
		System.out.println("Size: " + cookies.size());

		System.out.println();
		System.out.println("ALL COOKIES AFTER:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}