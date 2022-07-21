package baekjoon.q4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int scores[];
		double sum = 0;
		double avg = 0;
		double per = 0;
		int count = 0;
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			scores = new int[N];
			for(int j=0; j<scores.length; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			avg = sum/scores.length;
			sum = 0;
			for(int j=0; j<scores.length; j++) {
				if(scores[j]>avg) {
					count++;
				}
			}
			//System.out.println(count);
			avg = 0;
			per = (double)count/(double)scores.length;
			System.out.printf("%2.3f", per*100);
			System.out.println("%");
			count = 0;
		}
		
	
	}

}
