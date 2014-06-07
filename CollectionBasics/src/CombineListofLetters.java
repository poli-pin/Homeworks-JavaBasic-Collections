import java.util.ArrayList;
import java.util.Scanner;


public class CombineListofLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();

		System.out.println("Enter first char list:");
		char[] ch = input.nextLine().toCharArray();
		
		for(int i = 0; i<ch.length; i++){
			list1.add(ch[i]);
		}
		System.out.println("Enter second char list:");
		char[] ch2 = input.nextLine().toCharArray();
		
		for(int i = 0; i<ch2.length; i++){
			list2.add(ch2[i]);
		}
		
		for(int i =0;i<list1.size(); i++){
			if(list1.get(i) == ' '){
				continue;
			}
			
			for(int j=0; j<list2.size(); j++){
			  if(list2.get(j)!=' '){
				  if(list1.get(i)==list2.get(j)){
					  list2.remove(j);
					  if(j<(list2.size()-1)){
					    list2.remove(j++);
					  }
					  if(i>0){
						  i--;
					  }
				  }
			  }else{
				  continue;
			  }
			}
		}
		list1.add(' ');
		list1.addAll(list2);
		for(char item: list1){
			System.out.print(item);
		}
	}

}
