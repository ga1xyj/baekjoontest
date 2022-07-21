package baekjoon.q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int prize = 0;
		//3개다 같을때
		if(num1 == num2 && num1 == num3) {
			prize = 10000 + num1 * 1000;
		//2개가 같을때
		}else if(num1 == num2 && num1 != num3){
			prize = 1000 + num1*100; 
		}else if(num2 == num3 && num2 != num1){
			prize = 1000 + num2*100; 
		}else if(num3 == num1 && num3 != num2){
			prize = 1000 + num3*100; 
		}else {
			prize = Math.max((Math.max(num1, num2)), num3)*100;
		}
		System.out.println(prize);
		
	}
}