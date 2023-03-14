package String;

public class ReverseString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		for(int i = 0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i; // 5-1-0 = > 4
			
			char frontChar = sb.charAt(front);
			char backchar = sb.charAt(back);
			
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontChar);
		}
		
		System.out.println(sb);
	}
}
