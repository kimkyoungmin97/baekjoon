package programmers;

import java.util.LinkedList;
import java.util.Queue;
public class Truck_on_the_bridge {
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		int answer = 0;
		
		Queue<Integer> queue = getQueue(truck_weights);
        answer = getAnswer(queue, weight, bridge_length);
        System.out.println(answer);
	}
		
		//대기 트럭 큐 생성
	    private static Queue<Integer> getQueue(int[] truck_weights) {
	        Queue<Integer> queue = new LinkedList<>();
	        
	        for(int i = 0; i < truck_weights.length; ++i) {
	            queue.offer(truck_weights[i]);
	        }
	        return queue;
	    }
	    //메인 로직
	    private static int getAnswer(Queue<Integer> queue, int weight, int bridge_length) {
	        Queue<int[]> bridge_queue = new LinkedList<>(); // 다리를 건너는 트럭 큐생성(트럭무게,경과시간)
	        int total_time = 0; // 전체시간
	        int sum_weight = 0; //다리 위 트럭무게의 합
	        //대기트럭 큐 & 다리를 건너는 트럭 큐 모두 빌때까지 반복
	        while(!(queue.isEmpty() && bridge_queue.isEmpty())) {
	            total_time++; //시간 증가
	            //다리를 건너는 트럭로직
	            if(!bridge_queue.isEmpty()){ // 다리 위에 트럭이 존재할 떄
	                //다리 위의 트럭 경과시간 +1
	                for(int[] truck : bridge_queue){
	                    truck[1]+= 1;
	                }
	                //트럭이 다리위에 올라온지 bridge_length만큼 지났을때
	                if(bridge_queue.peek()[1] == (bridge_length+1)){
	                    sum_weight -= bridge_queue.peek()[0]; // 다리위 무게에서 트럭무게 뺴기
	                    bridge_queue.poll(); //다리위에서 트럭삭제
	                }
	            }
	            //대기 트럭 로직
	            //다리를 건너는 트럭 큐의 요소가 bridge_length보다 작을떄 &&
	            // 대기 트럭큐에 트럭이 남아 있을때
	            if(bridge_queue.size() < bridge_length && !queue.isEmpty()) {
	                int now_truck = queue.peek();
	                sum_weight += now_truck; 
	                //다리 위 트럭무게의 합이 weight와 같거나 작을때
	                if(sum_weight <= weight){
	                    bridge_queue.offer(new int[] {now_truck,1}); //다리 위에 트럭 추가
	                    queue.poll(); // 대기트럭에서 트럭 삭제
	                }else{
	                    sum_weight -= now_truck;
	                }
	            }
	        }
	        return total_time;
	}

}
