package baekjoonpratice;


import java.util.Scanner;

public class Baekjoon_1057 {
	
//	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] alpahbet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] arr = new int[26];
		String word = sc.nextLine();
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int i = 0; i < word.length(); ++i) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				arr[0] += 1;
			}else if(word.charAt(i) == 'b' || word.charAt(i) == 'B') {
				arr[1] +=1;
			}else if(word.charAt(i) == 'c' || word.charAt(i) == 'C') {
				arr[2] +=1;
			}else if(word.charAt(i) == 'd' || word.charAt(i) == 'D') {
				arr[3] +=1;
			}else if(word.charAt(i) == 'e' || word.charAt(i) == 'E') {
				arr[4] +=1;
			}else if(word.charAt(i) == 'f' || word.charAt(i) == 'F') {
				arr[5] +=1;
			}else if(word.charAt(i) == 'g' || word.charAt(i) == 'G') {
				arr[6] +=1;
			}else if(word.charAt(i) == 'h' || word.charAt(i) == 'H') {
				arr[7] +=1;
			}else if(word.charAt(i) == 'i' || word.charAt(i) == 'I') {
				arr[8] +=1;
			}else if(word.charAt(i) == 'j' || word.charAt(i) == 'J') {
				arr[9] +=1;
			}else if(word.charAt(i) == 'k' || word.charAt(i) == 'K') {
				arr[10] +=1;
			}else if(word.charAt(i) == 'l' || word.charAt(i) == 'L') {
				arr[11] +=1;
			}else if(word.charAt(i) == 'm' || word.charAt(i) == 'M') {
				arr[12] +=1;
			}else if(word.charAt(i) == 'n' || word.charAt(i) == 'N') {
				arr[13] +=1;
			}else if(word.charAt(i) == 'o' || word.charAt(i) == 'O') {
				arr[14] +=1;
			}else if(word.charAt(i) == 'p' || word.charAt(i) == 'P') {
				arr[15] +=1;
			}else if(word.charAt(i) == 'q' || word.charAt(i) == 'Q') {
				arr[16] +=1;
			}else if(word.charAt(i) == 'r' || word.charAt(i) == 'R') {
				arr[17] +=1;
			}else if(word.charAt(i) == 's' || word.charAt(i) == 'S') {
				arr[18] +=1;
			}else if(word.charAt(i) == 't' || word.charAt(i) == 'T') {
				arr[19] +=1;
			}else if(word.charAt(i) == 'u' || word.charAt(i) == 'U') {
				arr[20] +=1;
			}else if(word.charAt(i) == 'v' || word.charAt(i) == 'V') {
				arr[21] +=1;
			}else if(word.charAt(i) == 'w' || word.charAt(i) == 'W') {
				arr[22] +=1;
			}else if(word.charAt(i) == 'x' || word.charAt(i) == 'X') {
				arr[23] +=1;
			}else if(word.charAt(i) == 'y' || word.charAt(i) == 'Y') {
				arr[24] +=1;
			}else if(word.charAt(i) == 'z' || word.charAt(i) == 'Z') {
				arr[25] +=1;
			}
		}
		for(int i = 0; i <26; ++i) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
				count = 0;
			}else if(arr[i] == max) {
				count = 1;
			}
		}
		
		if(count == 1) {
			System.out.println("?");
		}else if(count == 0) {
			System.out.println(alpahbet[index]);
		}
		
		
	}

}
