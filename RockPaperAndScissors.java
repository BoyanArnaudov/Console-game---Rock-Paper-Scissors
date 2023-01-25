import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {
    private static final String rock = "Rock";
    private static final String paper = "Paper";
    private static final String scissors = "Scissors";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        String computerMove = "";
        String playerMove = "";
        int wins = 0;
        int looses = 0;
        while (play) {
            System.out.print ("Choose [r]ock, [p]aper or [s]cissors: ");
            String choose = input.nextLine();

            if (choose.equals("r") || choose.equals("rock")) {
                playerMove = rock;
            } else if (choose.equals("p") || choose.equals("paper")) {
                playerMove = paper;
            } else if (choose.equals("s") || choose.equals("scissors")) {
                playerMove = scissors;
            } else if (choose.equals("q") || choose.equals("quit")) {
                play = false;
                System.out.println("Thank you for playing!");
                System.out.printf("W: %d; L: %d", wins, looses);
                return;
            } else {
                System.out.println("Invalid Input. Try again ...");
                continue;
            }
            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);
            switch (computerRandomNumber){
                case 0: computerMove = rock;
                    break;
                case 1: computerMove = paper;
                    break;
                case 2: computerMove = scissors;
                    break;
            }

            if ((playerMove.equals(rock) && computerMove.equals(scissors)) || (playerMove.equals(paper) && computerMove.equals(rock))
                    || (playerMove.equals(scissors) && computerMove.equals(paper))) {
                System.out.println("You win :)");
                wins ++;
            } else if ((playerMove.equals(rock) && computerMove.equals(rock)) || (playerMove.equals(paper) && computerMove.equals(paper))
                    || (playerMove.equals(scissors) && computerMove.equals(scissors))) {
                System.out.println("Draw!");
            } else {
                System.out.println("You lose :(");
                looses ++;
            }
        }


    }
}