package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pratice_DFS_backtracking {
	
	public static void main(String[] args) {
		
		String[] arr = {"1","2","3"}; // 배열
		boolean[] used = new boolean[arr.length]; //사용여부 배열 false로 초기화
		List<String> list = dfs(arr, used, new StringBuilder(), 0, new ArrayList<>());
		System.out.println(list);
		
	}
	
	private static List<String> dfs(String[] arr, boolean[] used, StringBuilder sb, int depth,List<String> list) {
		
		//만든 문자열 출력
		if (depth > 0) {
	        list.add(sb.toString());
	    }
	
		for(int i = 0; i < arr.length; ++i) {
			if(used[i] == true) { //이미 쓴 숫자일 경우 패스
				continue;
			}else { // 쓰지않은 숫자면
				used[i] = true; // 숫자 사용
				sb.append(arr[i]); // 숫자 추가
				
				dfs(arr,used,sb,depth+1,list); // 길이를 1 증가시켜 다시 반복
				
				//백트래킹
		        sb.deleteCharAt(sb.length() - 1);
		        used[i] = false;
			}
			

		}
		return list;
		
	}

}
