/*
 * Calculator Program
 * Author: Zain Siddiqui
 */
public class Calculator {

	public static void main(String[] args) {
		// 
		System.out.println("Enter First Number: ");
		double num1 = IO.readDouble();
		
		System.out.println("Enter Second Number: ");
		double num2 = IO.readDouble();
		
		System.out.println("Enter Number: ");
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Divison");
		int oP = IO.readInt();
		
		if (oP == 1) {
			double ans = num1 + num2;
			IO.outputDoubleAnswer(ans);
			return;
		}
		if (oP == 2) {
			double ans = num1 - num2;
			IO.outputDoubleAnswer(ans);
			return;
		}
		if (oP == 3) {
			double ans = num1 * num2;
			IO.outputDoubleAnswer(ans);
			return;
		}
		if (oP == 4) {
			if (num2 != 0) {
			double ans = num1/num2;
			IO.outputDoubleAnswer(ans);
			return;
			} else {
				System.out.println("Error: Cannot divide by zero");
				return;
			}
		}
		if (oP < 1 || oP > 4) {
			System.out.println("Invalid Operation");
		}
	}
}	
