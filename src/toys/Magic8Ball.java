package toys;

import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "";
		Random random = new Random();
		Scanner strScan = new Scanner(System.in);
		boolean again = false;
		String yesOrNo = "";
		String[] answers = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now","Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
		
		do{
			do{
				System.out.println("Ask a question ending with a \"?\"");
				question = strScan.nextLine();
				if((question.isEmpty())){
					System.out.println("Type something");
					continue;
				}
				else if(question.charAt(question.length()-1)==63){ 
					System.out.println("You asked: " + question + "\nMagic 8 Ball says: " + answers[random.nextInt(answers.length)]);
				}
				else{
					System.out.println("You didn't ask me a question. Please try again.");
					continue;
				}
				
			}while((question.isEmpty())||!(question.charAt(question.length()-1)==63));
			
		}while(letsGoAgain(yesOrNo, again, strScan));
	}

	public static boolean letsGoAgain(String yesOrNo, boolean again, Scanner strScan){
		do{
			System.out.println("Do you want to continue? Y or N");
			yesOrNo = strScan.nextLine();
			//in case the user types "y" or "n" it will still go through
			yesOrNo = yesOrNo.toUpperCase();
			if(yesOrNo.equals("Y")){
				again = true;
			}
			else if(yesOrNo.equals("N")){
				again = false;
			}
			else{
				System.out.println("You didn't type \"Y\" or \"N\". please try again");
			}
			
		}while((!(yesOrNo.equals("Y"))) && (!(yesOrNo.equals("N"))));
		
		return again;
	}
	
}
