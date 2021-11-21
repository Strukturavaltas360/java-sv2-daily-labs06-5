package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("Subaru",2.0,Color.BLUE,12_000);

    @Test
    void testCreateCar() {
        Car car = new Car("Subaru",2.0,Color.BLUE,12000);
        assertEquals("Subaru",car.getType());
        assertEquals(2.0, car.getEngineSize());
        assertEquals(Color.BLUE, car.getColor());
        assertEquals(12_000,car.getPrice());
    }

    @Test
    void testDecreasePrice() {

        car.decreasePrice(10);
        assertEquals(10800, car.getPrice());
        assertTrue(10800 == car.getPrice());

        car.decreasePrice(99);
        assertEquals(108, car.getPrice());
    }

    @Test
    void testDecreasePriceWithWrongPercent() {
        car.decreasePrice(0);
        assertEquals(12_000, car.getPrice());

        car.decreasePrice(100);
        assertEquals(0,car.getPrice());

    }
}