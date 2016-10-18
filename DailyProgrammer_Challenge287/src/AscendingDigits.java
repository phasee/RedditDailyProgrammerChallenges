import java.util.Arrays;

public class AscendingDigits extends Number  {
	//Number number = new Number();
	protected int[] numberArray = new int[NUMBER_LENGTH];
	
	public AscendingDigits() {
		this("0001");
	}
	
	public AscendingDigits(String number) {
		setNumber(number);
	}
	
	public String returnAscendingDigits() {
		
		String number = getNumber();
		
		if (!checkNumberIsFourDigit()) {
			number = makeNumberFourDigits(getNumber());
			setNumber(number);
		}
		
		for (int i = 0; i < Number.NUMBER_LENGTH; i++) {

			int digit = stringToInt(number) % 10;
			number = number.substring(0, number.length() - 1);
			
			numberArray[i] = digit;
			
		}
		
		Arrays.sort(numberArray);
		
		String ArrayToString = "";
		
		for (int num : numberArray) {
			ArrayToString += num;
		}
		
		return ArrayToString;
	}
	
	@Override
	public String toString() {
		return ("The ascending digits from " + makeNumberFourDigits(getNumber()) +
							" are " + returnAscendingDigits());
		
	}

}
