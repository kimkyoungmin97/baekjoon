package pratice;


import java.util.Map;

public class midas1 {
	
	//초기버전
	public static void main(String[] args) {
		//기본 제공 데이터
		int n = 5;
		int w = 10;
		int[] gift = {4, 3, 2, 1, 1};
		int sum = 0;
		String answer = "NO"; // 답은 기본적으로 NO설정
		for(int i = 0; i < gift.length-2; ++i) { // 첫번째 선물, 0번째부터 시작 gift배열-2까지 반복
			for(int j = i+1; j < gift.length-1; ++j) { // 두번째 선물, 첫번째선물 다음부터 시작 gift배열-1까지 반복
				for(int k = j+1; k < gift.length; ++k) {//세번째 선물, 두번째 선물 다음부터 시작 gift배열길이까지 반복
					sum = gift[i] + gift[j] + gift[k]; //선물무게의 합
					if(sum == w) { //선물무게의 합이 w와 같을 시
						answer = "YES";
					}
				}
			}	
		}
		System.out.println(answer);
	}
}
