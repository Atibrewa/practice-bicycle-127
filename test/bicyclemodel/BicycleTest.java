package bicyclemodel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BicycleTest {
    @Test
    void changeDirection() {
        Bicycle bike = new Bicycle();
        bike.setDirection(50);
        assertEquals(50,bike.getDirection());
        bike.setDirection(98);
        assertEquals(90, bike.getDirection());
        bike.setDirection(-950);
        assertEquals(-90, bike.getDirection());
    }
    
    @Test
    void accelerate() {
        Bicycle bike = new Bicycle();
        bike.pedalHarder();
        assertEquals(1.8, bike.getSpeed());
        bike.pedalHarder();
        assertEquals(3.42, bike.getSpeed());
    }

    @Test
    void deccelerate() {
        Bicycle bike = new Bicycle();
        bike.pedalHarder();
        bike.pedalHarder();
        bike.brake();
        assertEquals(.378, bike.getSpeed(), 0.0001);
    }

    @Test
    void checkStart () {
        Bicycle bike = new Bicycle();
        assertEquals(0, bike.getSpeed());
        assertEquals(0, bike.getDirection());
    }

    @Test
    void constructorCheck() {
        Bicycle bike = new Bicycle (0.5, 3, 5);
        bike.pedalHarder();
        assertEquals(1.5, bike.getSpeed(), 0.1);
        bike.brake();
        assertEquals(0, bike.getSpeed(), 0.0001);
    }
}
