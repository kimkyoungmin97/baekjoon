package pratice;



public class midas3 {
	
	public static void main(String[] args) {
		String s = "aaabcddd";
		String answer ="";
		int cnt = 1; //temp의 카운트
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); ++i) {
			if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			}else {
				sb.append(s.charAt(i));
				if(cnt != 1) {
					sb.append(cnt);
				}
				cnt = 1;
			}
			
		}
		System.out.println(sb);	
	}

}
