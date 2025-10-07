package programmers;
import java.util.Map;
import java.util.HashMap;
public class Clothes {
	public static void main(String[] args) {
		int answer = 1;
		String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}
		,{"green_turban", "headgear"}};
		Map<String, Integer> map = getMap(clothes);
		for(Map.Entry<String, Integer> e : map.entrySet()){
            answer *= (e.getValue() + 1);
        }
        answer-= 1;
		System.out.println(answer);
		
	}
	private static Map<String, Integer> getMap(String[][] clothes){
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; ++i){
	        map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0) + 1);
	    }
	    return map;
	}

}
