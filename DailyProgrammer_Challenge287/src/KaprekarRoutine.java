
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
		
		int returnNum;
		int count = 0;
		
		while (Integer.parseInt(ad.getNumber()) != KAPREKAR_NUMBER) {
			int num1 = Integer.parseInt(this.returnDescendingDigits());
			int num2 = Integer.parseInt(ad.returnAscendingDigits());
			
			if (!(num1 == num2)) {
				returnNum = num1 - num2;
				ad.setNumber("" + returnNum);
				count++;
			} else {
				break;
			}
			
		}
		
		return count;
	}
	
	@Override
	public String toString() {
		return ("Kaprekar(" + ad.getNumber() + ") -> " + returnKaprekarIteration());
	}
	
}