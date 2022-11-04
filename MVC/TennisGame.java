package MVC;

import java.util.ArrayList;

public class TennisGame {
    private static final String LOVE_ALL = "Love-All";
    private static final String FIFTEEN_ALL = "Fifteen-All";
    private static final String THIRTY_ALL = "Thirty-All";
    private static final String FORTY_ALL = "Forty-All";
    private static final String DEUCE = "Deuce";
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";

    public static String getScore(String playerFirstName, String playerTwoName, int mScoreFirst, int mScoreTwo) {
        String score = "";
        int tempScore = 0;
        if (mScoreFirst == mScoreTwo) {
            switch (mScoreFirst) {
                case 0:
                    score = LOVE_ALL;
                    break;
                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        } else if (mScoreFirst >= 4 || mScoreTwo >= 4) {
            int minusResult = mScoreFirst - mScoreTwo;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mScoreFirst;
                else {
                    score += "-";
                    tempScore = mScoreTwo;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
