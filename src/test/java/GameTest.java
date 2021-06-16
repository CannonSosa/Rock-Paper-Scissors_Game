import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class GameTest {
    @Test
    public void checkAllTies() {
        RockPaperScissorsGame.GameLogic(1,1);
        RockPaperScissorsGame.GameLogic(2,2);
        RockPaperScissorsGame.GameLogic(3,3);
        int checkTies = RockPaperScissorsGame.getTies();
        assertEquals(checkTies,3);
    }
    @Test
    public void checkAllPlayer1Wins() {
        RockPaperScissorsGame.GameLogic(1,2);
        RockPaperScissorsGame.GameLogic(2,3);
        RockPaperScissorsGame.GameLogic(3,1);
        int p1 = RockPaperScissorsGame.getPlayer1Wins();
        assertEquals(p1,3);
    }
    @Test
    public void checkAllPlayer2Wins() {
        RockPaperScissorsGame.GameLogic(2,1);
        RockPaperScissorsGame.GameLogic(3,2);
        RockPaperScissorsGame.GameLogic(1,3);
        int p2 = RockPaperScissorsGame.getPlayer2Wins();
        assertEquals(p2,3);
    }
}
