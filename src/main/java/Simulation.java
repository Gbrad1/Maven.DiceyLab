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
            bin.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        LOGGER.info("\n***\n" + "Simulation of " + numberOfDiesToThrow +
               " dice tossed for " + numberOfTosses + " times.\n***");
        String toReturn = "\n";
        for (int i = numberOfDiesToThrow; i <= numberOfDiesToThrow * 6; i++) {
            double percentage = (double)(bin.sumCount.get(i)) / (double)(numberOfTosses);
            int starCount = bin.sumCount.get(i) / 10000;
            String actualStar = "";
            String formatted = String.format("%3d", i);
            String formattedNumOfRolls = String.format("%10d", bin.sumCount.get(i));
            String formattedPercentage = String.format("%.2f", percentage);
            for (int j = 0; j < starCount; j++) {
                actualStar += "*";
            }
            toReturn += formatted + " : " + formattedNumOfRolls + ": " + formattedPercentage + " " + actualStar + "\n";
        }
        LOGGER.info(toReturn);
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
        diceToRoll.runSimulation();
        diceToRoll.printResults();
    }

}
