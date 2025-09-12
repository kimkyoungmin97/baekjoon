package baekjoonpratice;

import java.util.Scanner;

public class Baekjoon_1316 {
//	그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//	예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//	첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다.
//	단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//	
//	첫째 줄에 그룹 단어의 개수를 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); //단어의 갯수 N개 입력
		int count = 0; // 그룹단어 갯수,초기엔 0		
		//N번 반복
		for(int i = 0; i < N; ++i) {
			String word = sc.next(); // 단어입력
			boolean check = false;
				// 그룹단어 체크
				//비교문자
				for(int k = 0; k < word.length()-1; ++k) {
					//비교대상문자
					for(int l = k+1; l <word.length(); ++l) {
						//바로옆의문자와 비교
						if(word.charAt(k) == word.charAt(k+1)) {
							break; //같으면 패스
						}else if(word.charAt(k) == word.charAt(l)) {
							check = true; 
							break;
						}
					}
					if(check==true) {
						break;
					}
				}
				if(check==false) {
					count++;
				}
		}
		
		System.out.println(count);
	}
}
