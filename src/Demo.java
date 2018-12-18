import ua.khpi.kedrov.practice1.*; 
/**
 * @author Nikita Kedrov
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Part 1");
		Part1.hello();
		System.out.println("Part 2");
		Part2.main(args);
		System.out.println("Part 3");
		Part3.main(args);
		System.out.println("Part 4");
		Part4.main(args);
		System.out.println("Part 5");
		Part5.main(args);
		System.out.println("Part 6");
		Part6.main(args);
		System.out.println("Part 7");
		System.out.println("chars2digits");
		System.out.println(Part7.chars2digits("AZG"));
		System.out.println("digits2chars");
		System.out.println(Part7.digits2chars(1360));
		System.out.println("rightColumn");
		System.out.println(Part7.rightColumn("AZG"));
	}

}
