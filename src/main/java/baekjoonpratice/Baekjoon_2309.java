package baekjoonpratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
//아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
//뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

//입력
//아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
//출력
//일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.

public class Baekjoon_2309 {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		int height = 0;
		//9명의 난쟁이들의 키를 입력받음
		for(int i =0; i < 9; ++i) {
			String str = br.readLine();
			list.add(Integer.parseInt(str));
		}		
		//7명의 난쟁이를 골라 키의 합을 구함
		outer:
		for(int i= 0; i <list.size(); ++i){
			for(int j = i+1; j <list.size(); ++j) {
				for(int k = 0; k < list.size(); ++k) {
					if(k == i || k == j) {
						height+=0;
					}else {
						height+=list.get(k);
					}
				}
				if(height == 100) { //키의 합이 100이면 리스트 제거하고 반복문 종료
					list.remove(i);
					list.remove(j-1);
					break outer;
				}else {
					height = 0; // 키의 합 초기화									
				}
			}
		}
		list.sort((a,b) -> a-b); // 리스트 오름차순 정렬
		for(int i = 0; i< list.size(); ++i) {
			sb.append(list.get(i)+"\n");
		}
		System.out.println(sb);
	}

}

