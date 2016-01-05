import java.util.Scanner;
public class J1 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int month = input.nextInt();
		int day = input.nextInt();
		
		if(month == 1 && day < 18){
			System.out.println("Before");
		}else if(month == 1 && day == 18){
			System.out.println("Special");
		}else if(month >= 1 && day > 18){
			System.out.println("After");
		}
		
		
		
		
	}
}
