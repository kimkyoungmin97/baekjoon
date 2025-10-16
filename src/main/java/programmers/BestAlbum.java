package programmers;

public class BestAlbum {
	
	
	
	
//	//////초기 연습
//	 public int[] solution(String[] genres, int[] plays) {
//	        int[] answer = {};
//	        Map<String, Map<Integer, Integer>> map = getMap(genres,plays);
//	        System.out.println(map);
//	        getList(map);
//	        //  //정렬
//	        // for(Map.Entry<String, Map<Integer, Integer>> e : map.entrySet()){
//	        //     System.out.println("장르:" + e.getKey()); 
//	        //     List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
//	        //     for(Map.Entry<Integer, Integer> song : e.getValue().entrySet()){
//	        //         list.add(song);
//	        //         list.sort((a,b) -> b.getValue() - a.getValue());
//	        //     }
//	        //     System.out.println(list);
//	        // }
//	        return answer;
//	    }
//	//데이터구조 만들기
//	    private Map<String, Map<Integer, Integer>> getMap(String[] genres, int[] plays) {
//	        Map<String, Map<Integer, Integer>> map = new HashMap<>();
//	        for(int i = 0; i < genres.length; ++i){
//	            if(!map.containsKey(genres[i])){ //처음 본 장르일떄 내부맵생성
//	                map.put(genres[i],new HashMap<Integer, Integer>());
//	            }
//	            map.get(genres[i]).put(i,plays[i]);
//	        }
//	        return map;
//	    }
//	    // Map구조를 List로 변환
//	    private void getList(Map<String, Map<Integer, Integer>> map) {
//	        System.out.println("여까지왔어");
//	        List<Map.Entry<String, Map<Integer, Integer>>> list = new ArrayList<>();
//	        
//	        for(Map.Entry<String, Map<Integer, Integer>> innerMap : map.entrySet()){
//	            list.add(innerMap);
//	            
////	             for(Map.Entry<Integer, Integer> song : innerMap.getValue().entrySet()){
////	                 // System.out.println("고유번호:" + song.getKey()+"횟수:" + song.getValue());
////	                 System.out.println(song);
//	               
////	             }
//
//	        }
//	        System.out.println(list);
//	        // System.out.println(list.get(0).getKey());
//	        // System.out.println(list.get(0).getValue());
//	        for(Map.Entry<String, Map<Integer, Integer>> e : list){
//	            System.out.println(e.getKey());
//	            for(Map.Entry<Integer, Integer> song : e.getValue().entrySet()){
//	                System.out.println(song);
//	            }
//	        }
//	       
//	        
//	       
//	    }

}
