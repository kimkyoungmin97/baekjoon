package programmers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//프로그래머스 소수찾기

public class Find_prime_numbers {
	
	public static void main(String[] args) {
        int answer = 0;
        String numbers = "17";
        Set<Integer> nums = new HashSet<>();
        String[] arr = getArr(numbers);
        boolean[] used = new boolean[arr.length];
        dfs(arr, used, new StringBuilder(), nums, 0);
        
        for(int i : nums) {
            if(isDecimal(i)){
                ++answer;
            }
        }
        System.out.println(answer);
        
    }
    
    private static String[] getArr(String numbers) {
        String[] arr = new String[numbers.length()];
        for(int i = 0; i < numbers.length(); ++i){
            arr[i] = numbers.charAt(i) +"";
        }
        return arr;
    }
    
    //소수인지 아닌지 판별
    // true : 소수 false: 소수아님
    private static boolean isDecimal(int num) {
        boolean decimal = true;
        int count = 0;
        for(int i = 1; i <= num; ++i){
            if(num % i == 0){
                ++count;
            }
        }
        if(count != 2){
            decimal = false;
        }
        return decimal;
    }
    //경우의 수 구하기
    private static void dfs(String[] arr, boolean[] used, StringBuilder path, Set<Integer> nums, int depth) {
        
        if(depth > 0) {
            nums.add(Integer.parseInt(path.toString()));
        }
        
        for(int i = 0; i < arr.length; ++i) {
            if(used[i] == true) {
                continue;
            }else {
                used[i] = true;
                path.append(arr[i]);
                
                dfs(arr,used,path,nums,depth+1);
                
                path.deleteCharAt(path.length()-1);
                used[i] = false;    
            }       
        }
    }

}
