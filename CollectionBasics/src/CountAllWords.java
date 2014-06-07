import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		
		String str = input.nextLine();
		String[] strs = str.split("[\\W]+");
		
		int countWords = strs.length;
		System.out.println(countWords);
	}
}
