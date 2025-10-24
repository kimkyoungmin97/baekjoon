package programmers;
import java.util.*;

public class DartGame {
	
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int answer = 0;
		String[] area = getArea(dartResult);
        answer = getScore(area);
        System.out.println(answer);
	}
	//문자열 쪼개기
    private static String[] getArea(String dartResult) {
        String[] area = new String[3];
        int index = 0; //area의 인덱스
        for(int i = 0; i < dartResult.length() && index < 3; ++i){
            int end = 0;
            //숫자가 나오면 다음문자가 반드시 S,D.T중 하나이므로 end 인덱스 설정
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                end = i+1;
                //숫자가 10이 나올 경우엔 end 인덱스 재설정
                if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                    end = i+2;

                }
                if(dartResult.charAt(end) == 'S' || dartResult.charAt(end) == 'D' ||
                   dartResult.charAt(end) == 'T') {
                    end++;
                }
                if(end < dartResult.length() &&
                   (dartResult.charAt(end) == '*' || dartResult.charAt(end) =='#')){
                   end++; 
                }
                //end인덱스가 구해지면 area배열에 문자열 쪼개서 넣기,end인덱스 초기화
                if(end != 0){
                    area[index] = dartResult.substring(i,end); //쪼갠 문자열 저장
                    index++;//다음 구역으로 이동
                    i = end - 1; //
                }
            }
        }
        return area;
    }
  //점수계산
    private static int getScore(String[] area){
        int[] roundScore = new int[3];
        int nowScore = 0;
        int totalScore = 0;
        for(int i = 0; i < area.length; ++i){
            String str = area[i]; //현재 라운드 문자열
            for(int j = 0; j < str.length(); ++j){
                //기본 점수 계산 & 보너스구역 계산
                if(str.charAt(j) == 'S' || str.charAt(j) == 'D' || str.charAt(j) == 'T'){
                    nowScore = Integer.parseInt(str.substring(0,j));
                    if(str.charAt(j) == 'D'){
                        nowScore = nowScore * nowScore;
                    } else if(str.charAt(j) == 'T') {
                        nowScore = nowScore * nowScore * nowScore;
                    }
                    break; //현재 라운드 기본점수&보너스구역 합산 점수 구하면 break
                } 
            }
            //옵션 계산(nowScore는 이미 구해졌음)
            if(str.charAt(str.length()-1) == '*'){ //스타상일 시
                if(i>=1){ //두번째 라운드부터 스타상이 나오면
                    roundScore[i-1]*=2; //전라운드 점수 2배
                }
                nowScore*=2; //현재라운드점수 2배
            }else if(str.charAt(str.length()-1) == '#'){//아차상일 시
                nowScore *= -1;//현재점수 마이너스
            }
            roundScore[i] = nowScore; //라운드별 점수 저장
        }
        //각 라운드 점수 합산
        totalScore = roundScore[0] + roundScore[1] + roundScore[2];
        return totalScore;
    }

}
