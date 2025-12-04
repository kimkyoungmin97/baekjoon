package programmers;

//프로그래머스 H_Index
public class H_index {
	
	public static void main(String[] args) {
		int answer = 0;
		int[] citations = {3,0,6,1,5};
		answer = getH_index(citations);
		System.out.println(answer);
	}
    private static int getH_index(int[] citations) {
        int h_index = 1;
        while(true) {
            int h = 0;
            for(int i = 0; i < citations.length; ++i) {
                if(h_index <= citations[i]) {
                    h++;
                }
            }
            if(h >= h_index) {
                h_index++;
            }else{
                h_index--;
                break;
            }
        }
        return h_index;
    }

}
