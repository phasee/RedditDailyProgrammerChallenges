import java.util.Scanner;

public class LargestDigitTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a 4 digit number: ");
		String number = in.next();
		
		LargestDigit largestDigit = new LargestDigit(number);
		AscendingDigits ad = new AscendingDigits(number);
		KaprekarRoutine kr = new KaprekarRoutine(number);
		
		System.out.println(largestDigit.toString());
		System.out.println(ad.toString());
		System.out.println(kr.toString());
		System.out.println("The highest Kaprekar Routine Iteration: " + kr.findHighestKaprekarIteration());
		
		in.close();

	}

}
