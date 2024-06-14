import java.util.*;
public class GuessTheNumber{
    public static void main(String[] args)
{
    Scanner scanner =new Scanner(System.in);
Random random =new Random();
System.out.println("Welcome to the guess the number game");
String playAgain="yes";
int totalAttempts=0;
int roundsWon=0;
while (playAgain.equalsIgnoreCase("yes"))
{
    int secretNumber =random.nextInt(100)+1; //generate a random number between 1 and 100
int attempts =0;
System.out.println("\n I've picked a number between 1 and 100.Try to guess it !!\n Let the number be :"+ secretNumber);
while (attempts <5)
{
    //Limit the no of attempts to 5
    System.out.print("Enter your guess:");
    int userGuess;
    try{
        userGuess=scanner.nextInt();
    }
    catch(java.util.InputMismatchException e)
    {
        System.out.println("Invalid input.please enter a valid number");
        scanner.nextLine();//clear the input Buffer
        continue;

    }
attempts++;

if (userGuess <secretNumber)
{System.out.println("Too low!Try again");}

else if(userGuess >secretNumber)
{System.out.println ("Too high!Try again"); }

else
{
    System.out.println("congratulations! you have guessed the number"+ secretNumber + "in" +attempts + "attempts!");
    roundsWon++;
    totalAttempts +=attempts;
    break;
}}
if(attempts==5)
{
    System.out.println("\nSorry you've reached the maximum no. of attempts. the correct number was" + secretNumber +".");
}
    System.out.print("\nDo u want to play another round?(yes/no):");
    playAgain =scanner.next();

}
if(roundsWon >0)
{
    double averageAttempts =(double) totalAttempts/roundsWon;
    System.out.println("\nYou won"+ roundsWon + "rounds with an average of " + String.format("%2f",averageAttempts)+ "attempts per round");
}
else{
    System.out.println("Thanks for playing! Goodbye!");
}
scanner.close();
}
}

