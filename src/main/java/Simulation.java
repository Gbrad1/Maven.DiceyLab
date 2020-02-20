import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

public class Simulation {
    private Integer numberOfDiesToThrow;
    private Integer numberOfTosses;
    Bins bin;
    Dice dice;

    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer diesToThrow, Integer howManyTosses) {
        dice = new Dice(diesToThrow);
        bin = new Bins(diesToThrow, diesToThrow * 6);
        this.numberOfDiesToThrow = diesToThrow;
        this.numberOfTosses = howManyTosses;
    }

    public void runSimulation() {

        Random randomNumber = new Random();

        for (int i = 0; i < numberOfTosses; i++) {
            int sum = 0;
            for (int j = 0; j < numberOfDiesToThrow; j++) {
                 int random = randomNumber.nextInt(6) + 1;
                 sum += random;
            }
            for (int k = 0; k < bin.sumCount.size(); k++) {
                if (numberOfDiesToThrow + k == sum) {
                    bin.sumCount.set(k, (bin.sumCount.get(k) + 1));
                }
                bin.sumCount.add(sum + k);
            }
        }
    }

    public void printResults() {

    }

    public void setNumberOfDiesToThrow(Integer newValue) {
        this.numberOfDiesToThrow = newValue;
    }

    public Integer getNumberOfDiesToThrow() {
        return numberOfDiesToThrow;
    }

    public void setNumberOfTosses(Integer newValue) {
        this.numberOfTosses = newValue;
    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }


    public static void main(String[] args) {
        Simulation diceToRoll = new Simulation(2, 1000000);
        Dice dice1 = new Dice(diceToRoll.numberOfDiesToThrow);
        diceToRoll.runSimulation();
        //diceToRoll.printResults();
    }

}
