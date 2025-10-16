package programmers;

public class New_id_recommendation {
	
	public static void main(String[] args) {
		String answer = "...!@BaT#*..y.abcdefghijklm";
		answer = step_1(answer);
	    answer = step_2(answer);
	    answer = step_3(answer);
	    answer = step_4(answer);
	    answer = step_5(answer);
	    answer = step_6(answer);
	    answer = step_7(answer);
	    System.out.println(answer);
	}
	
	//1단계:대문자를 소문자로 치환
    //A = 65, a = 97 -> int uniCode = '문자'; 로 알 수 있음
    //A->a가 되려면 +32
    private static String step_1(String new_id) {
// ★처음에 생각한 버전
//        int value = 'a'- 'A';
//        for(int i = 0; i < new_id.length(); ++i){
//            char temp = new_id.charAt(i);
//            if(temp>='A' & temp <='Z'){ //id에서 대문자 발견시
//                int index = new_id.indexOf(temp); //대문자 알파벳의 인덱스
//                temp+= value; // 대문자를 소문자로 치환
//                new_id = new_id.substring(0,index) + temp + new_id.substring(index+1);//id에 치환한값 넣기
//           }
//        }
//    	
//        return new_id;
    	StringBuilder id = new StringBuilder(new_id);
        int diff = 'a' - 'A';
        for(int i = 0; i < id.length(); ++i){
            char temp = id.charAt(i);
            if(temp >= 'A' & temp <='Z'){ //id에서 대문자 발견시
                temp+=diff;
                id.setCharAt(i,temp);
            }
              
        }
        return id.toString();
    }
  //2단계:소문자, 숫자, (-), (_), (.)를 제외한 모든 문자 제거
    private static String step_2(String id) {
        StringBuilder new_id = new StringBuilder(id);
        for(int i =0; i < new_id.length(); ++i){
            char temp = new_id.charAt(i);
            //해당 문자가 소문자,숫자,(-),(_),(.)이 아닐 시에
            if(!((temp >= '0' && temp <= '9')||
                 (temp >= 'a' && temp <='z')||
                 temp == '-' || temp == '_' || temp == '.')){
                new_id.deleteCharAt(i); //해당 문자 제거
                i--; //제거한만큼 i감소
            }
        }
        return new_id.toString();
    }
    //3단계: (.)가 2번 이상 연속된 부분을 하나의 (.)로 치환
    private static String step_3(String id) {
        StringBuilder new_id = new StringBuilder(id);
        for(int i = 0; i < new_id.length() - 1; ++i){
            char temp1 = new_id.charAt(i);
            char temp2 = new_id.charAt(i+1);
            if(temp1 == '.' && temp2 =='.') {//(.)가 2번연속 나오면
                new_id.deleteCharAt(i); // 앞의(.)삭제
                i--; // 1개의문자를 삭제했으니 i감소
            }
        }
        return new_id.toString(); 
    }
    //4단계:(.)가 처음이나 끝에 위치하면 제거
    private static String step_4(String id) {
        StringBuilder new_id = new StringBuilder(id);
        if(new_id.length() > 0 && new_id.charAt(0) == '.'){//처음이 (.)일떄
            new_id.deleteCharAt(0);
        }
        if(new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.'){//마지막이 (.)일떄
            new_id.deleteCharAt(new_id.length() - 1);
        }
        return new_id.toString();
    }
    //5단계:id가 빈문자열이라면, id에 "a"대입
    private static String step_5(String id) {
        if(id.length() == 0){
            id = "a";
        }
        return id;
    }
    //6단계: id의 길이가 16자 이상이면, id의 첫 15개의 문자를 제외한 나머지를 제거
    //제거 후에 (.)가 id의 끝에 위치한다면 끝에 위치한 (.)제거
    private static String step_6(String id) {
        if(id.length() >= 16){
            id = id.substring(0,15);
        }
        if(id.charAt(id.length() - 1) =='.'){
            id = id.substring(0,id.length()-1);
        }
        return id;
    }
    //7단계:id 길이가 2자 이하라면, id의 마지막 문자를 id가 3이 될때까지 반복해서 끝에 붙임
    private static String step_7(String id) {
        StringBuilder new_id = new StringBuilder(id);
        if(new_id.length() > 0 && new_id.length() <= 2){
            char temp = new_id.charAt(new_id.length()-1);
            while(new_id.length() < 3){
                new_id.append(temp);
            }
        }
        return new_id.toString();
    }

}
