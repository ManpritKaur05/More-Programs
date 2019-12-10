package Programs;

public class ReverseWordsInAGivenString {
	
	public static String reverse(String str) {
		
		String s[] = str.split(" ");
		String rev = "";
		
		for(int i=s.length-1; i>=0; i--) {
			rev = rev + s[i] + " ";
		}
		return rev;

		// it will print reverse by character
//		String rev = "";
//		int len = str.length();
//		for(int i=len-1; i>=0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		
//		return rev;
	}
	
	public static void main(String[] args) {
		
		String str = "I love programming very much";
		
		System.out.println(reverse(str));
		
	}

}
