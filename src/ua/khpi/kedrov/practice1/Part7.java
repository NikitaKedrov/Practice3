package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part7 {
	
	/**
	 * @param number
	 * @return
	 */
	public static int chars2digits(String number) {
		int num = 0;
		if (number.length() < 2) {
			num = (int) number.charAt(0);
			return num - 64;
		} else {
			for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
				num += ((int) number.charAt(i) - 64) * Math.pow(26, j);
			}
			return num;
		}
	}

	
	/**
	 * @param number
	 * @return
	 */
	public static String digits2chars(int number) {
		String num = "";
		if (number + 64 <= 90) {
			num = Character.toString((char) (number + 64));
			return num;
		} else {
			int remainder = 0;
			while (number / 26.0 != 0) {
				remainder = number % 26;
				if (remainder == 0) {
					number -= 26;
					num += Character.toString('Z');
				} else
					num += Character.toString((char) (remainder + 64));
				number = number / 26;
			}
			String[] reverseArray = num.split("");
			String reverseString = "";
			for (int i = reverseArray.length - 1; i >= 0; i--) {
				reverseString += reverseArray[i];
			}
			return reverseString;
		}
	}

	/**
	 * @param number
	 * @return
	 */
	public static String rightColumn(String number) {
		return digits2chars((chars2digits(number) + 1));
	}

	public static void main(String[] args) {

	}

}
