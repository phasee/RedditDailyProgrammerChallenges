
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
	
	public boolean compareKaprekarToInt(int comparison) {
		
		KaprekarRoutine kr1 = new KaprekarRoutine(ad.intToString(comparison));
		KaprekarRoutine kr2 = new KaprekarRoutine(ad.intToString(KAPREKAR_NUMBER));
		
		return kr1.returnDescendingDigits().equals(kr2.returnDescendingDigits());
	}
	
	public int returnKaprekarIteration() {

		int count = 0;
		
		while (!compareKaprekarToInt(ad.stringToInt(ad.getNumber()))) {
			
			String num1 = this.returnDescendingDigits();
			String num2 = ad.returnAscendingDigits();
			
			if (num1.equals(num2)) {
				break;
			}
			
			int returnNum = ad.stringToInt(num1) - ad.stringToInt(num2);
			
			ad.checkAndReturnFourDigitNumber(ad.intToString(returnNum));
	
			ad.setNumber(ad.intToString(returnNum));
			count++;

		}
		
		return count;
	}
	
	public int findHighestKaprekarIteration() {
		
		int iterator = 0;
		int counter = 0;
		
		for (int i = 0; i < 9999; i++) {
			
			KaprekarRoutine kr = new KaprekarRoutine(ad.intToString(i));
			
			iterator = kr.returnKaprekarIteration();
			
			if (iterator > counter) {
				counter = iterator;
			}
		}
		
		return counter;
	}
	
	@Override
	public String toString() {
		return ("Kaprekar(" + ad.getNumber() + ") -> " + returnKaprekarIteration());
	}
	
}
