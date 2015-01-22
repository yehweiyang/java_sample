package ch9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest {

	private static Scanner scanner;

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String name;
		while (true) {
			System.out.println("訪客名稱:");
			scanner = new Scanner(System.in);
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}
			list.add(name);
		}
		System.out.println("訪客名單:");
		foreach(list);
	}

	private static void foreach(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String guest = list.get(i);
			System.out.println(guest.toUpperCase());
		}

	}

}
