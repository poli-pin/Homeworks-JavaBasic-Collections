import java.util.Scanner;
import java.util.regex.*;


public class ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = input.nextLine();
		
		Pattern pat = Pattern.compile("([\\d\\w]+[.-_]*[\\d\\w]+@[\\w]+[-.]+[\\w]+)+");
		Matcher mat = pat.matcher(text);
		while(mat.find()){
			System.out.println(mat.group());
		}
	}

}
