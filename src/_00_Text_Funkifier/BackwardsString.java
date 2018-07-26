package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String finalText = ""; 
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			finalText = c + finalText; 
			
		
			
		}
		

		return finalText;
	}

}
