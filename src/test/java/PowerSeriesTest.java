import app.PowerSeries.PowerSeries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PowerSeriesTest {
    PowerSeries ps = new PowerSeries();
    double delta = 0.000001;
    double sin78 = Math.sin(0.78);
    double sin0 = 0.0;
    double sinPiDivided2 = 1.0;

    @Test
    public void powerLowerThanZeroExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ps.getResult(0, -1));
        assertEquals("Степень должна быть больше 0", exception.getMessage());
    }

    @Test
    public void powerTooBigExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ps.getResult(0, 34));
        assertEquals("Это слишком долго считать, мальчик иди домой", exception.getMessage());
    }

    @Test
    public void sin0Test(){
        assertEquals(sin0, ps.getResult(0, 1));
    }

    @Test
    public void sinPiDivided2Test(){
        assertEquals(sinPiDivided2, ps.getResult(Math.PI / 2, 10), delta);
    }

    @Test
    public void lowPowerTest(){
        assertNotEquals(sinPiDivided2, ps.getResult(Math.PI / 2, 5), delta);
    }

    @Test
    public void correctResultTest(){
        assertEquals(sin78, ps.getResult(0.78, 32), delta);
    }

    @Test
    public void checkFactorialTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ps.factorial(-1));
        assertEquals("Факториал должен быть больше 0", exception.getMessage());
    }

    @Test
    public void factorialFromZeroTest(){
        assertEquals(1, ps.factorial(0));
    }

    @Test
    public void factorialFromOneTest(){
        assertEquals(1, ps.factorial(1));
    }

    @Test
    public void factoiralCheckTest(){
        assertEquals(720, ps.factorial(6));
    }

    @Test
    public void factoiralBigCheckTest(){
        assertEquals(2432902008176640000L, ps.factorial(20));
    }
}
