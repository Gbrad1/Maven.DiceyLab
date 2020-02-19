import java.util.logging.Logger;

public class Simulation {
    private Integer numberOfDiesToThrow;
    private Integer numberOfTosses;
    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer diesToThrow, Integer howManyTosses) {
        this.numberOfDiesToThrow = diesToThrow;
        this.numberOfTosses = howManyTosses;
    }

    public static void main(String[] args) {
        Simulation diceToRoll = new Simulation(2, 1000000);
        diceToRoll.startSimulation();
        diceToRoll.printResults();
    }

    public void startSimulation() {

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

}
