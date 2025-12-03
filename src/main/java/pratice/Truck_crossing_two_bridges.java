package pratice;

import java.util.LinkedList;
import java.util.Queue;

//GPT가 만들어준 프로그래머스(다리를 지나는 트럭 Hard Mode)
//문제: "두 개의 다리를 지나는 트럭" (난이도: 중상)
//
//트럭은 한 줄로 대기하고 있고, 각각 무게를 가진다.
//이번에는 두 개의 다리가 있다.
//
//두 다리 모두:
//길이는 bridge_length (트럭이 올라간 뒤 지나가기까지 걸리는 시간)
//최대 하중은 weight
//트럭은 항상 현재 시점에 두 다리 중 더 빨리 비는 다리를 선택해서 올라간다.
//만약 두 다리가 조건이 같다면 첫번째 다리를 선택한다.
//모든 트럭이 지나가는 데 걸리는 총 시간을 구하라.
//
//📌 입력
//bridge_length: 2
//weight: 10
//truck_weights: [7, 4, 5, 6]
public class Truck_crossing_two_bridges {
	public static void main(String[] args) {
		int bridge_length = 2; //트럭이 올라간 뒤 지나가기까지 걸리는 시간
		int weight = 10; //다리의 최대 하중
		int[] truck_weights = {7,4,5,6}; //트럭의 무게
		int total_time = 0; //트럭이 지나가는데 걸리는 총 시간
		Queue<Integer> wating_bridge = new LinkedList<>(); // 트럭이 대기하는 다리
		Queue<int[]> bridge1 = new LinkedList<>(); //다리 1
		int bridge1_sum = 0; // 다리1위의 무게
		Queue<int[]> bridge2 = new LinkedList<>(); //다리 2
		int bridge2_sum = 0; // 다리2위의 무게
		
		//트럭이 대기하는 다리에 트럭 줄 세우기
		for(int i = 0; i <truck_weights.length; ++i) {
			wating_bridge.offer(truck_weights[i]);
		}
		//트럭이 대기하는 다리, 다리1, 다리2 가 전부 비워질때까지 반복
		while(!wating_bridge.isEmpty() || !bridge1.isEmpty() || !bridge2.isEmpty()) { 
			total_time++;//시간은 1초씩 증가
			int truck = wating_bridge.peek(); // 현재 대기중인 트럭(무게)
			
			if(bridge1.size() == bridge2.size()) { //두 다리위에 동일한 갯수의 트럭이 올라갔을때 -> 다리1로

			}else if(bridge1.size() > bridge2.size()) { //다리1에 트럭이 더 많을시 -> 다리2가 더 빨리 비니까 다리2로 가야함
				if(weight>= (bridge2_sum+=truck)) {
					bridge2.offer(new int[] {truck,1}); //트럭이 다리2위에 올라감 (무게,경과시간)
					wating_bridge.poll(); //대기다리에서 트럭 삭제
				}
				
			}else { // 다리2에 트럭이 더 많을시 -> 다리1이 더 빨리 비니까 다리1로 가야함
				
			}
			
			
		}
	
		
		
	}

}
