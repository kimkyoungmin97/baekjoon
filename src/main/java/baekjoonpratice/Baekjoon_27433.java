package baekjoonpratice;

import java.util.Scanner;

public class Baekjoon_27433 {
	
//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//	첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
//	첫째 줄에 N!을 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		long output = 1;
		
		if(input == 0) {
			System.out.println(1);
			return;
			
		} else {
			while(input>0) {
				output *= input;
				--input;
			}
		}
		System.out.println(output);
		
	}

}
