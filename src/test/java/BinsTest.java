import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void checkBinSize() {
        Bins bin = new Bins(2,12);
        int actual = bin.sumCount.size();
        int expected = 13;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBin() {
        Bins bin = new Bins(2,12);
        bin.incrementBin(1);
        int expected = 1;
        int actual = bin.sumCount.get(1);
        Assert.assertEquals(expected, actual);
    }
}
