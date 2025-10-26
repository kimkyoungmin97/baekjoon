package programmers;
import java.util.*;
public class Kth_number {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
        List<int[]> list = getList(array,commands); //리스트 생성
        sortList(list);//리스트 정렬
        for(int i = 0; i < commands.length; ++i){
            int index = commands[i][2] - 1; 
            answer[i] = list.get(i)[index];
        }
        System.out.println(Arrays.toString(answer));
		
	}
	//자른 배열 구하기
    private static int[] getArr(int[] array, int start, int end) {
        int[] arr = new int[end- start];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = array[start];
            start++;
        }
        return arr; 
    }
    //자른 배열이 모여있는 리스트 구하기
    private static List<int[]> getList(int[] array, int[][] commands) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < commands.length; ++i){
            int start = commands[i][0] -1;
            int end = commands[i][1];
            list.add(getArr(array,start,end));
        }
        return list;
    }
    //리스트안의 배열들을 정렬
    private static List<int[]> sortList(List<int[]> list) {
        for(int i = 0; i < list.size(); ++i){
            Arrays.sort(list.get(i));
        }
        return list;
    }

}
