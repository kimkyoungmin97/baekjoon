package pratice;

import java.util.HashMap;
import java.util.Map;

public class midas {
	
	//초기버전
	public static void main(String[] args) {
		//기본 제공 데이터
		int n = 5;
		int w = 10;
		int[] gift = {5,2,3,1,4};
		String answer = "NO"; //기본값
		//작성
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		for(int i = 0; i < gift.length; ++i) {
			for(int j = i+1; j < gift.length; ++j) {
				for(int k = i+2; k < gift.length; ++k) {
					sum = gift[i] + gift[j] +gift[k];
					if(!map.containsKey(sum)) {
						map.put(sum, 1);
					}
					if(map.containsKey(w)) {
						answer = "YES";
					}
				}
			}
		}
		System.out.println(answer);
	}
}
