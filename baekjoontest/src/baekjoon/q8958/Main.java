package baekjoon.q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[Integer.parseInt(sc.nextLine())];
		int count = 0;
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] += sc.nextLine();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					if (arr[i].charAt(j-1)=='X') {
						count++;
					} else {
						count++;
					}
				} else {
					count = 0;
				}
				point += count;
			}
			System.out.println(point);
			point = 0;
		}
	}
}