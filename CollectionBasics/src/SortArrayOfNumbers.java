import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer number:");
		
		int num = input.nextInt();
		int[] numArr = new int[num];
		
		System.out.printf("Enter %d numbers\n", num);
		
		for(int i=0; i<num; i++){
			numArr[i] = input.nextInt();
		}
		Arrays.sort(numArr);
		for (int n : numArr){
			System.out.printf("%d ", n);
		}
	}

}
