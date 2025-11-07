package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mock_exam {
	
	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		int[] one = {1,2,3,4,5}; //1번 수포자 패턴
        int[] two = {2,1,2,3,2,4,2,5}; // 2번 수포자 패턴
        int[] three = {3,3,1,1,2,2,4,4,5,5}; // 3번 수포자 패턴
        int oneCount = getAnswerCount(answers, one); //1번 수포자의 정답갯수
        int twoCount = getAnswerCount(answers, two); // 2번 수포자의 정답갯수
        int threeCount = getAnswerCount(answers, three); // 3번 수포자의 정답갯수
        int max = Math.max(oneCount,Math.max(twoCount,threeCount)); //제일 많이 맞춘 정답갯수
        List<Integer> list = new ArrayList<>();
        
        if(max == oneCount){
            list.add(1);
        }
        if(max == twoCount){
            list.add(2);
        }
        if(max == threeCount){
            list.add(3);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray(); // 리스트를 int배열로 바꿈
        System.out.println(Arrays.toString(answer));
	}
	
	// 정답 갯수 구하기
    private static int getAnswerCount(int[] answers, int[] arr) {
        int count = 0;
        for(int i = 0; i < answers.length; ++i){
            if(answers[i] == arr[i % arr.length]) {
                ++count;
            }
        }
        return count;
        
    }

}
