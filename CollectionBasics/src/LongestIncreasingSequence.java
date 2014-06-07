import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int maxStr = 0;
		int counter = 1;
		int oldCounter =0 ;
		
		Scanner input = new Scanner(System.in);
        System.out.println("Enter strings:");
		
		String str = input.nextLine();
		String[] strs = str.split(" ");

		
		for(int i = 0; i<strs.length-1; i++){
			
			if (Integer.parseInt(strs[i])<Integer.parseInt(strs[i+1])){
				System.out.printf("%s ", strs[i]);
				if(i==strs.length-2){
					System.out.printf("%s ", strs[i+1]);
				}
				counter++;
				if(oldCounter<counter){
				   maxStr = i+2-counter;
				   oldCounter = counter;
			    }
			}else{
				System.out.println(strs[i]);
				counter = 1 ;
				if(i==strs.length-2){
					System.out.printf("%s ", strs[i+1]);
				}
			}
		}
		if (oldCounter == 0){
			oldCounter =1;
		}
		System.out.print("\nLongest: ");
		for (int i = 0; i<oldCounter; i++){
		  System.out.printf("%s ", strs[maxStr+i]);
		}
	}

}
