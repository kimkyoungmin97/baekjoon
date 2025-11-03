package baekjoonpratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_1181 {

//	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//	1.길이가 짧은 것부터
//	2.길이가 같으면 사전 순으로
//	단, 중복된 단어는 하나만 남기고 제거해야 한다.

//	입력
//	첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000)
//	둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
//	주어지는 문자열의 길이는 50을 넘지 않는다.
//
//	출력
//	조건에 따라 정렬하여 단어들을 출력한다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> list = getList(N);
		System.out.println(list);
		sortList(list);
		for(int i = 0; i <list.size(); ++i) {
			System.out.println(list.get(i));
			
		}
	}

	// 입력받은 문자열을 담는 리스트 생성
	private static List<String> getList(int N) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		for(int i = 0; i < N; ++i) {
			String str = sc.nextLine();
			list.add(str);
		}
		return list;
	}
	//리스트 정렬
	private static List<String> sortList(List<String> list) {
		
		for(int i = 0; i < list.size(); ++i) {
			for(int j = i+1; j < list.size(); ++j) {
				//중복제거
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
				//길이 짧은순 정렬
				else if(list.get(i).length() > list.get(j).length()) {
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
				//길이가 같으면 사전순 정렬
				else if(list.get(i).length() == list.get(j).length()) {
					if(list.get(i).compareTo(list.get(j)) > 0) {
						String temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		
		return list;
	}

}
