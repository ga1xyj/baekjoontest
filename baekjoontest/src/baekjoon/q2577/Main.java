package baekjoon.q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int arr[] = new int[10];
		
		String D = String.valueOf(A*B*C);
		for(int i = 0; i<D.length(); i++) {
			for(int j = 0; j<10; j++) {
				if(D.charAt(i)==((char)j+'0')) {
					int count = 1;;
					arr[j] += count;
				}
			}
		}
		
		for(int k = 0; k<arr.length; k++) {
		System.out.println(arr[k]);
		}
		
	}
}
