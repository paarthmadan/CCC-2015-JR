import java.util.Scanner;
public class J1 {
	public static void main(String [] args){
		
		//intializing Scanner object
		Scanner input = new Scanner(System.in);
		
		//intializing variables
		int month = input.nextInt();
		int day = input.nextInt();
		
		//basic if statement deducing whether input is before or after certain integers
		if(month == 1 && day < 18){
			System.out.println("Before");
		}else if(month == 1 && day == 18){
			System.out.println("Special");
		}else if(month >= 1 && day > 18){
			System.out.println("After");
		}
		
		
		
		
	}
}
