import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random random = new Random();
		int min_number = 1;
		int max_number = 100;
		int guess_number = random.nextInt(max_number-min_number+1)+min_number;
		boolean correctGuess = false;
		int attempts = 0;
		System.out.println("Welcome to enter guessing game");
		System.out.println("I have choosen a number between "+min_number+" and "+max_number+". Can you guess it?");
		while(correctGuess==false&&attempts<3) {
		    System.out.print("Enter your guess: ");
		    int yourGuess=sc.nextInt();
		    attempts++;
		    if(yourGuess<guess_number) {
		        if(attempts<3)
		            System.out.println("Too low!Try again...");
		        else
		            break;
		    }
		    else if(yourGuess>guess_number) {
		        if(attempts<3)
		            System.out.println("Too high!Try again...");
		        else
		            break;
		    }else {
		        System.out.println("Congratulations!!!You correctly guessed the number "+guess_number+" in "+attempts+"attempts");
		        if(attempts==1) {
		            System.out.println("Score : 100");
		        }
		        else if(attempts==2) {
		            System.out.println("Score : 90");
		        }
		        else {
		            System.out.println("Score : 80");
		        }
		        break;
		    }
		}
		if(correctGuess==true||attempts>=3) {
		    System.out.println("Sorry!!You have run out of attempts...The correct number is "+guess_number);
		}
	}
}
