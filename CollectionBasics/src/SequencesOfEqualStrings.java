import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;


public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//ArrayList<String> strArr = new ArrayList<String>();
		
		System.out.println("Enter strings:");
		
		String str = input.nextLine();
		String[] strs = str.split(" ");
		
		for(int i = 0; i<strs.length-1; i++){
			if(strs[i].equals(strs[i+1])==true){
				System.out.printf("%s ", strs[i]);
				if(i==strs.length-2){
					System.out.printf("%s ", strs[i+1]);
				}
			}else{
				System.out.println(strs[i]);
				if(i==strs.length-2){
					System.out.printf("%s ", strs[i+1]);
				}
			}
		}
	}

}
