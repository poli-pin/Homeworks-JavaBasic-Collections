import java.util.Scanner;


public class LargestSequenceOfEqualString {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter strings:");
		
		String str = input.nextLine();
		String[] strs = str.split(" ");
		int maxStr = 0;
		int counter = 1;
		int oldCounter =0 ;
		
		for(int i = 0; i<strs.length-1; i++){
			if(strs[i].equals(strs[i+1])==true){
				counter++;
				if(oldCounter<counter){
					maxStr = i+2-counter;
				    oldCounter = counter;
			    }				
			}else{
				counter = 1 ;
			}
		}
		if (oldCounter == 0){
			oldCounter =1;
		}
		for (int i = 0; i<oldCounter; i++){
		  System.out.printf("%s ", strs[maxStr+i]);
		}
	}
}
