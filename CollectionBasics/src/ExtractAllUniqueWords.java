import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		
		Set<String> set = new TreeSet<String>(new MyComp());
		String[] str = input.nextLine().toLowerCase().split("\\W+"); 
		
		set.addAll(Arrays.asList(str));
		
		System.out.println(set);
	}

}

class MyComp implements Comparator<String>{
	 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
