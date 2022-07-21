package baekjoon.q1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		int max = 0;
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			max = max < arr[i] ? arr[i] : max;
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += (double)arr[i]/max*100;
		}
		System.out.println(sum/arr.length);
	}

}
