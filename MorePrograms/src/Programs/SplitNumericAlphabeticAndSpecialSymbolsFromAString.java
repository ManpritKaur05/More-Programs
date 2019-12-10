package Programs;

public class SplitNumericAlphabeticAndSpecialSymbolsFromAString {

	public static void main(String[] args) {
		
		SplitNumericAlphabeticAndSpecialSymbolsFromAString obj = new SplitNumericAlphabeticAndSpecialSymbolsFromAString();
		
		String str = "geeks01$$for02geeks03!@!!"; 
        obj.splitString(str);
	}
	
	public static void splitString(String str) {
		
		StringBuffer digit = new StringBuffer();
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) 
		{
			if(Character.isDigit(str.charAt(i)))
				digit.append(str.charAt(i));
			
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			
			else
				special.append(str.charAt(i));
		}
		
		System.out.println(digit);
		System.out.println(alpha);
		System.out.println(special);
	}
}
