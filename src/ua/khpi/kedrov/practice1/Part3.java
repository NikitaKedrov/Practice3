/**
 * 
 */
package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part3 {
	
	
	public static void spaceSeparatedOutput(String[] array) {
		if (array.length > 0) {
			String result = "";
			for (String string : array) {
				result += string + " ";
			}
			System.out.println(result);
		}else {
			System.out.println("args length = 0");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spaceSeparatedOutput(args);
	}

}
