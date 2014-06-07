import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MostFrequentWord {

	public static void main(String[] args) {
		
		Comparator<String> caseInsensitiveComparator =
			    new Comparator<String>(){
			      @Override
			      public int compare(String o1, String o2) {
			        return o1.compareToIgnoreCase(o2);
			      }
			};
		int maxValue = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String[] str = input.nextLine().toLowerCase().split("\\W+"); 
		Map<String, Integer> words = new TreeMap<String, Integer>(caseInsensitiveComparator);
		Integer count = 0;
		
		for(int i=0; i<str.length; i++){
			count = words.get(str[i]);
			if (count == null) {
		          count = 0;
		        }
		    words.put(str[i], count + 1);
		}
		
		for (Map.Entry<String, Integer> wordEntry : words.entrySet()) {
		    //System.out.printf("%s --> %d %n",wordEntry.getKey(), wordEntry.getValue());
			if (maxValue < wordEntry.getValue())
			    maxValue = wordEntry.getValue();
		} 
		for (Map.Entry<String, Integer> wordEntry : words.entrySet()) {
			if(wordEntry.getValue() == maxValue){
				System.out.printf("%s --> %d times %n",wordEntry.getKey(), wordEntry.getValue());
			}
		}
	}

}
