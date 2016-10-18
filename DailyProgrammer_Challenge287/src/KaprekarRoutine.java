
public class KaprekarRoutine  {
	private final int KAPREKAR_NUMBER = 6174;
	//private int count = 0;

	AscendingDigits ad = new AscendingDigits();
	
	public KaprekarRoutine() {
		this("0001");
	}
	
	public KaprekarRoutine(String number) {
		ad.setNumber(number);
	}
	
	public String returnDescendingDigits() {
		
		String result = ad.returnAscendingDigits();
		
		String[] resultArray = result.split("");
		
		String arrayToStringAsc = "";
		
		for (int i = resultArray.length - 1; i >= 0; i--) {
			arrayToStringAsc += resultArray[i];
		}
		
		return arrayToStringAsc;
	}
	
	public int returnKaprekarIteration() {

		int count = 0;
		
		while (Integer.parseInt(ad.getNumber()) != KAPREKAR_NUMBER) {
			String num1 = this.returnDescendingDigits();
			String num2 = ad.returnAscendingDigits();
			int returnNum = Integer.parseInt(num1) - Integer.parseInt(num2);
			
			if (num1.equals(num2) || returnNum == KAPREKAR_NUMBER) {
				break;
			}
			ad.checkAndReturnFourDigitNumber("" + returnNum);
	
			ad.setNumber("" + returnNum);
			count++;
		}
		
		return count;
	}
	
	@Override
	public String toString() {
		return ("Kaprekar(" + ad.getNumber() + ") -> " + returnKaprekarIteration());
	}
	
}
