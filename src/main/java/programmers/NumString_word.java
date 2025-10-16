package programmers;

public class NumString_word {
	
	public static void main(String[] args) {
		String input = "one4seveneight";
		int answer = 0;
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		
		for(int i= 0; i < word.length; ++i){
            while(input.contains(word[i])){
                int index =  input.indexOf(word[i]);
                int wordLength = word[i].length();
                input =input.substring(0,index)+(i+"")+ input.substring(index + wordLength); 
            }
        }
		answer = Integer.parseInt(input);
		System.out.println(answer);
	}
	


}
