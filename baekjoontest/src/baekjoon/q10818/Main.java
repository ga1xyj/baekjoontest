package baekjoon.q10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		
		for(int j=0; j<arr.length; j++) {
			max = arr[j] > max ? arr[j] : max;
			min = arr[j] < min ? arr[j] : min;
		}
		System.out.println(min + " " + max);
	}

}
