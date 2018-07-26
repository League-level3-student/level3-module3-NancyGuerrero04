package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String finalText = ""; 
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(i%2==1) { //Odd; lower
				c = Character.toUpperCase(c);
			}
			else { //Even; upper
				c = Character.toLowerCase(c);
				
			}
			
			
			finalText = finalText + c; 
			
		
			
		}
		

		return finalText;
	
	}

}
