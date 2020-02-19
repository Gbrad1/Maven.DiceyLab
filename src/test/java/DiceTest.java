import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void getNumberOfDiesToThrowTest() {
        Simulation roll = new Simulation(null, null);
        Integer expected = 2;
        roll.setNumberOfDiesToThrow(2);
        Integer actual = roll.getNumberOfDiesToThrow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDiesToTossTest() {
        Simulation roll = new Simulation(null, null);
        Integer expected = 10;
        roll.setNumberOfTosses(10);
        Integer actual = roll.getNumberOfTosses();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfDiesToThrowTest() {
        Simulation roll = new Simulation(null, null);
        Integer expected = 4;
        roll.setNumberOfDiesToThrow(4);
        Integer actual = roll.getNumberOfDiesToThrow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfDiesToTossTest() {
        Simulation roll = new Simulation(null, null);
        Integer expected = 500;
        roll.setNumberOfTosses(500);
        Integer actual = roll.getNumberOfTosses();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiceRoll() {
        Dice roll = new Dice(null);
        Integer actual = roll.rollDice();
        Integer expected = (int)(Math.random()*7);
        Assert.assertTrue(expected > 0 && expected < 7);
    }

}
