import java.util.ArrayList;
import java.util.Collections;

public class LargestDigit {
	Number num = new Number();

	private ArrayList<Integer> digitsOfNumber = new ArrayList<Integer>(Number.NUMBER_LENGTH);
	
	public LargestDigit() {
		this("1");
	}
	
	public LargestDigit(String number) {
		num.setNumber(number);
	}

	public int returnLargestDigit() {
		
		String fullNumber = num.getNumber();
		
		if (!num.checkNumberIsFourDigit()) {
			fullNumber = num.makeNumberFourDigits(num.getNumber());
			num.setNumber(fullNumber);
		}
		
		for (int i = 0; i < Number.NUMBER_LENGTH; i++) {

			int digit = Integer.parseInt(fullNumber) % 10;

			fullNumber = fullNumber.substring(0, fullNumber.length() - 1);
			
			digitsOfNumber.add(i, digit);
			
		}
		
		return Collections.max(digitsOfNumber, null);
	}
	
	@Override
	public String toString() {
		return ("The largest digit from " + num.makeNumberFourDigits(num.getNumber()) +
							" is " + returnLargestDigit());
		
	}
}
