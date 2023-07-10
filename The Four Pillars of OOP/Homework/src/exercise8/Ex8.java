package exercise8;
import java.util.Random;
import java.util.Scanner;
class Game {
    private int gameState;
    //method starting
    public void starting() {
        System.out.println("game starting");   
    }
    //method pausing
    public void pausing() {
        System.out.println("game pausing");
    }
    //method stoping
    public void stoping() {
        System.out.println("game stoping");
    }
}
// class SinglePlayerGame inherit form class Game
class SinglePlayerGame extends Game {
    public void playAgainstComputer() {
        System.out.println("Playing against computer...");
        //random 2 number and sum 
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10)+1;
        int sum = number1 + number2;
        boolean isWin = false;
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);

        //check player or computer win
        while(!isWin){
            System.out.print("Guess sum of number (1-20): ");
            int playerGuess = scanner.nextInt();
            if (playerGuess == sum){
                System.out.println("You win!");
                isWin = true;
                stoping();
                System.out.println("============================");
                return;
            }
            else if(playerGuess < sum){
                System.out.println("Low then sum. Try again.");
            }
            else {
                System.out.println("High then sum. Try again.");
            }

            int computerGuess = random.nextInt(20)+1;
            System.out.println("computer guess: " + computerGuess);
            if(computerGuess == sum){
                System.out.println("Computer win!");
                isWin = true;
                stoping();
                System.out.println("============================");
                return;
            }
        }
    }
}
//class MultiplayerGame inherit from class Game
class MultiplayerGame extends Game {
    public void playAgainstOtherPlayers() {
        System.out.println("Playing against other players...");
        // random 2 number and sum
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10)+1;
        int sum = number1 + number2;
        System.out.println(sum);

        boolean isWin = false;
        Scanner scanner = new Scanner(System.in);
         while(!isWin){
            System.out.print("Player1 guess sum of number (1-20): ");
            int player1 = scanner.nextInt();
            if (player1 == sum){
                System.out.println("Player1 win!");
                isWin = true;
                stoping();
                System.out.println("============================");
                return;
            }
            else if(player1 < sum){
                System.out.println("low then sum. Try again.");
            }
            else {
                System.out.println("high then sum. Try again.");
            }
            System.out.print("Player2 guess sum of number (1-20): ");
            int player2 = scanner.nextInt();
            if (player2 == sum){
                System.out.println("Player2 win!");
                isWin = true;
                stoping();
                System.out.println("============================");
                return;
            }
            else if(player2 < sum){
                System.out.println("low then sum. Try again.");
            }
            else {
                System.out.println("high then sum. Try again.");
            }
    }
    }
}
class GameLauncher {
    public GameLauncher(){
    }
    void launchGame(Game game) {
        game.starting();
    }
}
public class Ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Choose case (1-3) ");
            System.out.println("1. Singleplayer");
            System.out.println("2. Multipleplayers");
            System.out.println("3. Exit case");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            
            GameLauncher launch = new GameLauncher();
            switch (option){
                case 1:
                SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
                launch.launchGame(singlePlayerGame);
                singlePlayerGame.playAgainstComputer();
                break;
                case 2:
                MultiplayerGame multiPlayerGame = new MultiplayerGame();
                launch.launchGame(multiPlayerGame);
                multiPlayerGame.playAgainstOtherPlayers();
                break;
                case 3:
                System.out.println("Exit case successfully");
                System.exit(option);
                default:
                System.out.println("Invalid option...");         
            }
        }   
    }
}
