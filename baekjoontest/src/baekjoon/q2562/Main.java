package baekjoon.q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr =  new int[9];
		int max = arr[0];
		int index=1;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			max = max < arr[j] ? arr[j] : max;		
			if(max == arr[j]) {
				index = j+1;}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
