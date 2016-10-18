public class Number {
	private String number;
	public static final int NUMBER_LENGTH = 4;

	public Number() {
		this("1");
	}
	
	public Number(String i) {
		setNumber(i);
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getLengthOfNumber() {
		int length = String.valueOf(number).length();
		
		return length;
	}
	
	public boolean checkNumberIsFourDigit() {
		
		return (getLengthOfNumber() == NUMBER_LENGTH);
		
	}
	
	public String makeNumberFourDigits(String number) {
			
		String result = null;
		
		for (int i = 0; i < getLengthOfNumber(); i++) {
			result = String.format("%1$0" + NUMBER_LENGTH + "d", 
									Integer.parseInt(number));
		}
		
		return result;
	}
	
	public void checkAndReturnFourDigitNumber(String number) {
		
		if (!checkNumberIsFourDigit()) {
			makeNumberFourDigits(number);
		}
	}
	

}
