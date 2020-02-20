import java.util.ArrayList;
import java.util.logging.Logger;

public class Bins {
    private Integer minPossibleDieOutCome;
    private Integer maxPossibleDieOutcome;

    ArrayList<Integer> sumCount = new ArrayList<>();

    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    public Bins(Integer minBin, Integer maxBin) {
        this.minPossibleDieOutCome = minBin;
        this.maxPossibleDieOutcome = maxBin;
        for (int i = minBin; i <= maxBin; i++) {
            sumCount.add(0);
        }
    }

    public void fillBin() {

    }
}
