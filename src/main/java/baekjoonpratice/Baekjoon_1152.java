package baekjoonpratice;


import java.util.Scanner;

public class Baekjoon_1152 {
	
	//	영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
	//	이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
	//	단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
	
	//	첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
	//	단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
	
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);

		        int count = 0;

		        String text = sc.nextLine().trim();

		        if (text.isEmpty()) {
		            System.out.println(0);
		            return;
		        }

		        for (int i = 0; i < text.length(); ++i) {
		            if (text.charAt(i) == ' ') {
		                ++count;
		            }
		        }

		        System.out.println(count + 1);
			
			
		}
	

}
