package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//프로그래머스(카펫)
public class Carpet {
	public static void main(String[] args) {
		int[] answer = new int[2];
		int brown = 24;
		int yellow = 24;
		List<int[]> list = getList(yellow);
	    int[] arr = getYellow(list,brown);
	    answer[0] = arr[0] + 2;
	    answer[1] = arr[1] + 2;
	    System.out.println(Arrays.toString(answer));
	}
	
    private static List<int[]> getList(int yellow) {
        List<int[]> list = new ArrayList<>();
        for(int i = 1; i <= yellow; ++i){
            int w = i; // 가로
            int h = yellow /i; //세로
            if(yellow % i == 0 && w >= h){
                list.add(new int[] {w,h});
            }
        }
        return list;
    }
    private static int[] getYellow(List<int[]> list, int brown) {
        int[] yellow = new int[2];
        for(int[] arr : list) {
            if((arr[0] * 2) + (arr[1] * 2) + 4 == brown){
                yellow[0] = arr[0];
                yellow[1] = arr[1];
            }
        }
        return yellow;
    }

}
