/**
 * 
 */
package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part5 {
	
	/**
	 * @param args
	 * @throws NumberFormatException
	 */
	public static void sumOfDigits(String[] args) throws NumberFormatException {
		try {
			if(args.length == 0){
				System.out.println("args empty");
			}else if (Integer.parseInt(args[0]) < 0) {
				System.out.println("Number < 0");
			}else {
				String[] str = args[0].split("");
				int sum = 0;
				for (String s : str) {
					sum += Integer.parseInt(s);
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sumOfDigits(args);
	}

}
