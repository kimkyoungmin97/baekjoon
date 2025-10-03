package programmers;

import java.util.HashMap;
import java.util.Map;

public class Non_complement {
	
		public static void main(String[] args) {
			String[] participant = {"mislav", "stanko", "mislav", "ana"};
			String[] completion = {"stanko", "ana", "mislav"};
			System.out.println(non_completion(participant,completion));
		}
	    
	    private static String non_completion(String[] participant, String[] completion){
	        Map<String, Integer> map = new HashMap<>();
	      
	        for(int i = 0; i < participant.length; ++i){
	            if(map.get(participant[i]) == null){
	                map.put(participant[i],1);
	            }else{
	                map.put(participant[i],map.get(participant[i]) + 1);
	            }
	        }
	        for(int i = 0; i < completion.length; ++i){
	            map.put(completion[i],map.get(completion[i])-1);
	        }
	        for(int i = 0; i < participant.length; ++i)
	            if(map.get(participant[i]) != 0){
	                return participant[i];
	            }
	        return "";
	        
	        
	    }

}
