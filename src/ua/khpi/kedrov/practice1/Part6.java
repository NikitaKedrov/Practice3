/**
 * 
 */
package ua.khpi.kedrov.practice1;

/**
 * @author Nikita Kedrov
 *
 */
public class Part6 {
	
	/**
	 * @param args
	 * @throws NumberFormatException
	 */
	public static void primeNumbers(String[] args) throws NumberFormatException {
		if(args.length > 0) {
			try {
				int n = Integer.parseInt(args[0]);
				for(int i = 2; i <= n; i++){
					int count = 0;
					for(int j = 2; j <= n; j++){
						if(i % j == 0){
							count++;
						}
					}
				if(count == 1) {
					System.out.print(i + " ");
					}
					count = 0;
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		primeNumbers(args);
	}

}
