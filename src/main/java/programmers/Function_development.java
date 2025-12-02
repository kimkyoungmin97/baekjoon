package programmers;
//프로그래머스(기능개발)
import java.util.*;
public class Function_development {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] arr = getArr(progresses, speeds);
        int[] answer = getAnswer(arr);
        System.out.println(Arrays.toString(answer));
	}
	//각 기능작업이 끝나기까지 남은 일수 구하기
    private static int[] getArr(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; ++i) {
            int temp = 100 - progresses[i]; // 남은 진행률
            if(temp % speeds[i] == 0) {
                arr[i] = temp / speeds[i];
            }else {
                arr[i] = (temp / speeds[i]) + 1;
            }   
        }
        return arr;
    }
    //메인로직
    private static int[] getAnswer(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int temp = arr[0];
        int cnt = 1;
        for(int i = 1; i < arr.length; ++i) {
            if(temp < arr[i]) {
                list.add(cnt);
                cnt = 1;
                temp = arr[i];
            }else {
                cnt++;
            }
            if(i == arr.length -1) {
                list.add(cnt);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
