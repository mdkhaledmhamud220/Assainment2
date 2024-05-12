import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SodaCanTest {
    SodaCan caan = new SodaCan(6, 3);
    @Test
    void getVolume() {
        assertEquals(42.4115, caan.getVolume(), .0001);
    }

    @Test
    void getSurfaceArea() {
        assertEquals(56.5486, caan.getSurfaceArea(), .0001);
    }
}