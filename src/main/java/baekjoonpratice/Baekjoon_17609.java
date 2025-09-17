package baekjoonpratice;

import java.util.Scanner;

public class Baekjoon_17609 {
	
//		회문(回文) 또는 팰린드롬(palindrome)은 앞 뒤 방향으로 볼 때 같은 순서의 문자로 구성된 문자열을 말한다.
//		예를 들어 ‘abba’ ‘kayak’, ‘reviver’, ‘madam’은 모두 회문이다.
//		만일 그 자체는 회문이 아니지만 한 문자를 삭제하여 회문으로 만들 수 있는 문자열이라면 우리는 이런 문자열을 “유사회문”(pseudo palindrome)이라고 부른다.
//		예를 들어 ‘summuus’는 5번째나 혹은 6번째 문자 ‘u’를 제거하여 ‘summus’인 회문이 되므로 유사회문이다.
//		여러분은 제시된 문자열을 분석하여 그것이 그 자체로 회문인지, 또는 한 문자를 삭제하면 회문이 되는 “유사회문”인지, 
//		아니면 회문이나 유사회문도 아닌 일반 문자열인지를 판단해야 한다. 만일 문자열 그 자체로 회문이면 0, 유사회문이면 1, 그 외는 2를 출력해야 한다. 
//		
//		입력의 첫 줄에는 주어지는 문자열의 개수를 나타내는 정수 T(1 ≤ T ≤ 30)가 주어진다. 다음 줄부터 T개의 줄에 걸쳐 한 줄에 하나의 문자열이 입력으로 주어진다.
//		주어지는 문자열의 길이는 3 이상 100,000 이하이고, 영문 알파벳 소문자로만 이루어져 있다.
//		
//		각 문자열이 회문인지, 유사 회문인지, 둘 모두 해당되지 않는지를 판단하여 회문이면 0, 유사 회문이면 1, 둘 모두 아니면 2를 순서대로 한 줄에 하나씩 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
//		String[] arr = new String[T];
//		
//		for(int i = 0; i < T; ++i) {
//			String word = sc.next();
//			//짝수면 회문인지 판단
//			if(word.length() % 2 == 0) {
//				arr[i] = "짝수";
//			//홀수면 회문인지 유사 회문인지 판단
//			}else {
//				arr[i] = "홀수";
//			}
//		}
//		for(int j = 0; j < T; ++j) {
//			System.out.println(arr[j]);
//		}
		
		//test
		
		String test = sc.next();
		//true면 회문 or 유사회문
		//false면 그냥 단어
		boolean a = false;
		for(int i = 0; i < test.length()/2; ++i) {
			if(test.charAt(i) == test.charAt(test.length()-(i+1))) {
				a = true;
			}
		}
		if(a == true) {
			System.out.println("회문 or 유사회문");
		}else {
			System.out.println("그냥단어");
		}
		
		
	}

}
