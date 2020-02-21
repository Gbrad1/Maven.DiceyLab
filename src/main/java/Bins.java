import java.util.ArrayList;
import java.util.logging.Logger;

public class Bins {
    private Integer minPossibleDieOutCome;
    private Integer maxPossibleDieOutcome;

    public ArrayList<Integer> sumCount;

    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    public Bins(Integer minBin, Integer maxBin) {
        sumCount = new ArrayList<>();
        this.minPossibleDieOutCome = minBin;
        this.maxPossibleDieOutcome = maxBin;
        for (int i = 0; i <= maxBin; i++) {
            sumCount.add(0);
        }
    }

    public void incrementBin(Integer index) {
        Integer a = sumCount.get(index);
        a++;
        sumCount.set(index, a);
    }
}
