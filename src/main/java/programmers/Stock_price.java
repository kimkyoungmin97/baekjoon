package programmers;

import java.util.Arrays;

//프로그래머스(주식가격)

public class Stock_price {
	
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = new int[prices.length];
		
		getSecond(prices, answer);
		
		System.out.println(Arrays.toString(answer));
		
		
	}
    private static void getSecond(int[] prices, int[] answer) {
        
        for(int i = 0; i < prices.length; ++i) {
            int second = 0;
            for(int j =i+1; j<prices.length; ++j) {
                second++;
                if(prices[i] <= prices[j]){
                    continue;
                }else {
                    break;
                }
            }
            answer[i] = second;
        }
    }
}
