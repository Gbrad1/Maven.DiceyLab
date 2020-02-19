import java.util.logging.Logger;

public class Dice {
    Integer randomToss;


    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    public Dice (Integer newToss) {
        this.randomToss = newToss;
    }

    public Integer rollDice () {
        Integer diceOutPut = (int)(Math.random() * 7);
        return diceOutPut;
    }

}
