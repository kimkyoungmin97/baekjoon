package programmers;

import java.util.LinkedList;
import java.util.List;

public class Crane_drawing {
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
        List<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < moves.length; ++i){
            for(int j = 0; j < board.length; ++j){
                if(board[j][moves[i]-1] == 0){
                    continue;
                }else{
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
                
            }
        }
        int i =0;
        while(i < list.size()-1){
            int left = list.get(i);
            int right = list.get(i+1);
            if(left == right){
                answer+=2;
                list.remove(i+1);
                list.remove(i);
                i-=2;
                
            }
            ++i;
            
        }
        System.out.println(answer);
		
		
		
		
	}

}
