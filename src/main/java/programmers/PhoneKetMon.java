package programmers;

import java.util.Map;
import java.util.HashMap;
public class PhoneKetMon {
	
	public static void main(String[] args) {
		int answer = 0;
		int nums[] = {3,1,2,3};
		Map<Integer, Integer> map = getMap(nums);
	      if(getNumOfPhoneKetMon(map) < getNum(nums)){
	          answer = getNumOfPhoneKetMon(map);
	      }else {
	          answer = getNum(nums);
	      }
	     System.out.println(answer);
	        
		
	}

	 //가져갈 수 있는 폰켓몬 수 구하기
    private static int getNum(int[] nums) {
        int num = nums.length / 2;
        return num;
    }
    //포켓몬 종류별 등장 횟수 구하기
    private static Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i < nums.length; ++i){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        return map;
    }
    //포켓몬 종류 구하기
    private static int getNumOfPhoneKetMon(Map<Integer, Integer> map) {
        int numOfPhoneKetMon = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            numOfPhoneKetMon++;
        }
        return numOfPhoneKetMon;
    }

}
