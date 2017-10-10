package part_03;


import com.sun.media.jfxmedia.events.PlayerStateEvent;

import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {


//        // generate a random number >= 0 and < 3
        int computerHand = 0 + (int) (Math.random() * (3 - 0));
        // use this as the computer's hand

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        int playerHand = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String storeCompHand = getHand(computerHand);

        // call getHand(int hand) to determine the players hand
        String storePlayerHand = getHand(playerHand);

//        // call determineWinner(int computerHand, int playerHand) to determine who one
        String storeWinner = determineWinner(computerHand, playerHand);

        System.out.println(storeWinner);
        System.out.println("The computer's hand was " + storeCompHand);
        System.out.println("Your hand was " + storePlayerHand);
//        // print out a message to the console stating which hand the computer had, which hand
//        // the play had and who won.
    }

    public static String getHand(int hand) {
        String returnHand = "";
//        use a switch statement to determine each players hand
        switch (hand) {
            case 0:
                returnHand = "scissor";
                break;
            case 1:
                returnHand = "rock";
                break;
            case 2:
                returnHand = "paper";
//        // 0 = scissor, 1 = rock, 2 = paper
        }
        return returnHand;
    }

    public static String determineWinner(int computer, int player) {
        String status = "";
        switch (player) {
            // use conditional ("?") operator
            case 0:
                status = (computer != 1) ? "You won!" : "You lost :(";
                break;
            case 1:
                status = (computer != 2) ? "You won!" : "You lost :(";
                break;
            case 2:
                status = (computer != 0) ? "You won!" : "You lost :(";
                break;
            // implement the two remaining cases
        }
        return status;
    }
}