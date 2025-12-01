package programmers;
//프로그래머스(올바른괄호)
import java.util.*;
public class Correct_parentheses {
	public static void main(String[] args) {
		boolean answer = true;
		String s = "())(()";
        Deque<Character> deque = getDeque(s);
        answer = isCorrectParentheses(deque);
        System.out.println(answer);
		
	}
	//데이터 구조 만들기(Deque)
    private static Deque<Character> getDeque(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for(int i = 0; i < s.length(); ++i) {
            deque.offerLast(s.charAt(i));
        }
        return deque;
    }
  //메인로직
    private static boolean isCorrectParentheses(Deque<Character> deque) {
        boolean answer = true;
        int cnt = 0;
        
        if(deque.peekFirst() == ')'){ //예외 처리
            return false;
        }
        while(!deque.isEmpty()) { // deque가 빌때까지 반복
            if(deque.peekFirst() == '(') { // 괄호가 열리면
                cnt++;
            }else { // 닫히면
                cnt--;
            }
            if(cnt < 0) { // 괄호가 열리지도 않았는데 먼저 닫히면
                return false;
            }
            deque.pollFirst();
        }
        if(cnt == 0){ // 괄호가 올바르게 열리고 닫혔으면
            answer = true;
        }else { //아닐 시
            answer = false;
        }
        return answer;
    }
	

}
