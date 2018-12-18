package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part4 {

	/**
	 * @param args
	 */
	public static void greatestCommonDivisor(String[] args) throws NumberFormatException{
		int firstNumber;
		int secondNumber;
		
		if (args.length == 2) {
			try {
				firstNumber = Integer.parseInt(args[0]);
				secondNumber = Integer.parseInt(args[1]);	
				while (firstNumber != secondNumber) {
					if (firstNumber > secondNumber) {
						firstNumber = firstNumber - secondNumber;
					}else {
						secondNumber = secondNumber - firstNumber;
					}
				}
				System.out.println(firstNumber);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("args length != 2");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		greatestCommonDivisor(args);
	}

}
