package programmers;

//프로그래머스(JadenCase 문자열 만들기);
public class Jaden_case {
	
	public static void main(String[] args) {
		String answer = "";
		String s ="3people unFollowed me";
		answer = getTrans(s);
		System.out.println(s);
	}
    //대문자,소문자변환
    private static String getTrans(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true; // 단어의 첫 글자인지 여부
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == ' ') {          // 공백이면 그대로 추가
                sb.append(ch);
                isFirst = true;       // 다음 문자는 단어의 첫 글자
            } else {
                if (isFirst) {        // 단어의 첫 글자
                    sb.append(Character.toUpperCase(ch));
                    isFirst = false;
                } else {              // 단어의 두 번째 이후 글자
                    sb.append(Character.toLowerCase(ch));
                }
            }
          
        }
        
        return sb.toString();
        
    }

}
