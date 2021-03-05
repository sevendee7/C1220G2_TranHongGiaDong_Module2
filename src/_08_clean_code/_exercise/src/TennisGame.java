package _08_clean_code.Exercises.src;

public class TennisGame {
    public static String getScore(String nameOfFirstPlayer, String nameOfSecondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score = "";
        int tempScore = 0;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            score = getScoreWhenDraw(scoreOfFirstPlayer);
        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            score = getResult(scoreOfFirstPlayer, scoreOfSecondPlayer);
        } else {
            score = getCurrentScore(scoreOfFirstPlayer, scoreOfSecondPlayer, score);
        }
        return score;
    }

    private static String getCurrentScore(int scoreOfFirstPlayer, int scoreOfSecondPlayer, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfFirstPlayer;
            else {
                score += "-";
                tempScore = scoreOfSecondPlayer;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getResult(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score;
        int minusResult = scoreOfFirstPlayer - scoreOfSecondPlayer;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getScoreWhenDraw(int scoreOfFirstPlayer) {
        String score;
        switch (scoreOfFirstPlayer) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}
