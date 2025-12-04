package programmers;

import java.util.Arrays;

//프로그래머스(가장 큰 수)
public class Biggest_number {
	public static void main(String[] args) {
		String answer = "";
		int[] numbers = {3, 30, 34, 5, 9};
		String[] arr = getSort(numbers);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; ++i){
            sb.append(arr[i]);
        }
        answer = sb.toString();
//        if(arr[0].equals("0")) return "0";
        System.out.println(answer);
		
	}
    private static String[] getSort(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            arr[i] = numbers[i] +"";
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a + b));
        return arr;
    }

}
