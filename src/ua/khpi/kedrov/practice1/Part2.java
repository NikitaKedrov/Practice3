package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part2 {

	/**
	 * @param args
	 * @throws NumberFormatException
	 */
	public static void sum(String[] args) throws NumberFormatException {
		if (args.length == 2) {
			try {
				System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));  
		    } catch (NumberFormatException e) {
		    	System.out.println("Error, your enter not a number");
		    }
		}else {
			System.out.println("args length < 2");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(args);
	}

}
