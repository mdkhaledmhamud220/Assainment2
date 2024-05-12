import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalloonTest {
    Balloon b = new Balloon();
    @BeforeEach
    void setUp() {

    }

    @Test
    void addAir() {
        b.addAir(100);
        assertEquals(100, b.getVolume());
        assertEquals(2.8794, b.getRadius(), 0.0001);
        assertEquals(104.1879, b.getSurfaceArea(), 0.0001);
    }
}