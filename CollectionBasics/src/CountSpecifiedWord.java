import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = input.nextLine();
		
		System.out.println("Enter a word:");
		String word = input.nextLine();
		
		String[] strs = text.split("[\\W]+");
		Map<String, Integer> countWords = new HashMap<String, Integer>();
		
		for (String str : strs) {
		  Integer count = countWords.get(str.toLowerCase());
		  if (count == null) {
		    count = 0; 
		  }
		  countWords.put(str.toLowerCase(), count+1);
		}
		
		Integer value = countWords.get(word.toLowerCase());
		System.out.println((value==null)?0:value);
	}

}
