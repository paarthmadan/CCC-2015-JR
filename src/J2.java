import java.util.Scanner;
public class J2 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		
		char [] characters = text.toCharArray();
		
		
		int happyCount = 0;
		int sadCount = 0;
		boolean none = false;
		
		
		for(int i = 0; i < characters.length; i++){
			
			if(characters[i] == ':' && characters.length > 2){
				
				if(characters[i+2] == ')'){
					happyCount++;
				}else if(characters[i+2] == '('){
					sadCount++;
				}
				
			}else if (characters.length < 2){
				none = true;
			}
	
		}
		
			
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
