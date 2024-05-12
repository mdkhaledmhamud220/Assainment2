import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamConeTest {
    IceCreamCone ice = new IceCreamCone(5, 1.5);
    @Test
    void getSurfaceAreaAndVoloum() {
        assertEquals(24.5993, ice.getSurfaceArea(), .0001);
        assertEquals(11.7809, ice.getVolume(), .0001);
    }
}