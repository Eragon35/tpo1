import app.Gomanoids;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HistoryTest {
    @Test
    public void captureTest(){
        Gomanoids artur = new Gomanoids("Artur", 0, 0, 0,false, false);
        artur.capture();
        Assertions.assertFalse(artur.capture());
    }
}
