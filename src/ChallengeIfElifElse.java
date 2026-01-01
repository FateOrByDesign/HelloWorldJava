public class ChallengeIfElifElse {
    public static void main(String[] args) {
        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + finalScore);
        finalScore = calculateScore(10_000, 8, 200);
        System.out.println("Your final score was " + finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            return finalScore += 1000;
        }
        return 0;
    }
    public static int calculateScore(int score, int levelCompleted, int bonus){
        return calculateScore(true, score, levelCompleted, bonus);
    }
}
