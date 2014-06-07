import java.util.Scanner;


public class CountSubstringOccurencies {

	public static void main(String[] args) {
		int counter = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = input.nextLine();
		
		System.out.println("Enter a word:");
		String word = input.nextLine();
		
		String[] strs = text.split("[\\W]+");
		
		for(int i = 0;i<strs.length; i++){		
			for(int j=0; j<=strs[i].length()-word.length();j++){
				if(strs[i].toLowerCase().substring(j, j+word.length()).equals(word.toLowerCase())==true){
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
