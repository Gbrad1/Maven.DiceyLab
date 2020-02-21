import java.util.Random;
import java.util.logging.Logger;

public class Dice {
    Integer numberOfDiceToToss;

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    public Dice (Integer newNumToToss) {
        this.numberOfDiceToToss = newNumToToss;
    }

    public Integer maxNum() {
        return numberOfDiceToToss * 6;
    }

    public Integer leastNum() {
        return numberOfDiceToToss;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfDiceToToss; i++) {
            sum += randomNumber.nextInt(6) + 1;
        }
        return sum;
    }

}
