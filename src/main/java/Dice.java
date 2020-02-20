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

}
