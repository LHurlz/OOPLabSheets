package labsheet2;

import javax.swing.*;

public class RollTheDice {

    public static void main(String[] args) {
        String ask;
        int draws = 0, cpuWins = 0, playerWins = 0, games = 0;
        char result;

        ask = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");

        while (ask.equals("yes")) {

            //ask = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");

           // if(ask.equals("no"))
            //    break;

            result = rollTheDice();


            if (result == 'c')
                cpuWins++;
            else if (result == 'p')
                playerWins++;
            else
                draws++;

            games++;

            JOptionPane.showMessageDialog(null, "Games Played: " + games + "\nCPU Wins: " + cpuWins + "\nPlayer Wins: " + playerWins + "\nDraws: " + draws, "Game Info",
                    JOptionPane.INFORMATION_MESSAGE);


            ask = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");
        }


        JOptionPane.showMessageDialog(null, "Thanks for playing the game!", "Farewell", JOptionPane.INFORMATION_MESSAGE);


    }

    public static char rollTheDice() {
        double cpuRoll = 0, playerRoll = 0;
        //int draws=0, cpuWins=0, playerWins=0;

        cpuRoll = (int) (Math.random() * 12) + 1;

        JOptionPane.showMessageDialog(null, "The computer roll generated the value " + cpuRoll + "... now hit return to see the player roll",
                "Computer Roll", JOptionPane.INFORMATION_MESSAGE);

        playerRoll = (int) (Math.random() * 12) + 1;

        JOptionPane.showMessageDialog(null, "The player roll generated the value " + playerRoll, "Player Roll", JOptionPane.INFORMATION_MESSAGE);

        if (cpuRoll > playerRoll)
            return 'c';
            //cpuWins++;
        else if (cpuRoll < playerRoll)
            return 'p';
            //playerWins++;
        else
            return 'd';
        //draws++;
    }
}