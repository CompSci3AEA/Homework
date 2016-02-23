import java.util.Scanner;

public class ExerciseDectoBi {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive decimal integer value: ");
		
		number = in.nextInt();
		
		remainder(number);
	}
	
	
	public static void remainder(int number) {
		
		int remainder;
		
		if (number <= 1) {

				System.out.print(number);
				return;
		}
			remainder = number % 2;
			
			remainder(number >> 1);
			System.out.print(remainder);
		
	}
	
}
