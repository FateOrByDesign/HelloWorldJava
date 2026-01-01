public class MethodChallenge {
    public static void main(String[] args){
        // player 1
        int player1Position = calculateHighScorePosition(1500);
        displayHighScorePosition("Sanuda", player1Position);
        // player 2
        int player2Position = calculateHighScorePosition(999);
        displayHighScorePosition("Tim", player2Position);
        // player 3
        int player3Position = calculateHighScorePosition(499);
        displayHighScorePosition(player3Position);
        // player 4
        int player4Position = calculateHighScorePosition(99);
        displayHighScorePosition(player4Position);
        // player 5
        int player5Position = calculateHighScorePosition(-25);
        displayHighScorePosition("Gugsi", player5Position);
    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static void displayHighScorePosition(int position){
        displayHighScorePosition("Unknown", position);
    }


    public static int calculateHighScorePosition(double playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        else {
            return 4;
        }
    }
}
