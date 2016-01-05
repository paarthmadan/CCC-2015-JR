import java.util.Scanner;
public class J2 {
	public static void main(String [] args){
		
		//initializing Scanner object
		Scanner input = new Scanner(System.in);
		
		//initializing variables
		String text = input.nextLine();
		
		
		char [] characters = text.toCharArray();
		
		
		int happyCount = 0;
		int sadCount = 0;
		boolean none = false;
		
		//using for loop to loop through array of input
		for(int i = 0; i < characters.length; i++){
			//checking if character has ':' symbol and confirming it is over 3 characters
			if(characters[i] == ':' && characters.length > 2){
				//proceeding to check two indexes after the ':' symbol to determine if face is
				//happy ')' or sad '('
				if(characters[i+2] == ')'){
					happyCount++;
				}else if(characters[i+2] == '('){
					sadCount++;
				}
				//accounting for situations where array is less then two characters
			}else if (characters.length < 2){
				none = true;
			}
	
		}
		
			//use if statements to print which count had a higher integer value based on
			//additions made in ^for loop
			if(happyCount == 0 && sadCount ==  0 || none == true){
				System.out.println("none");
			}else if(happyCount == sadCount && happyCount != 0){
				System.out.println("unsure");
			}else if(happyCount > sadCount){
				System.out.println("happy");
			}else if(sadCount > happyCount){
			System.out.println("sad");
		}
	}
}
