package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("BestCar",15_000);

    @BeforeEach
    void init() {
        Car car = new Car("Subaru",2.0,Color.BLUE,12_000);
        carShop.addCar(car);
        carShop.addCar(new Car("Volvo",2.0,Color.BLUE,6_000));
        carShop.addCar(new Car("Renault",2.0,Color.BLUE,7_000));
        carShop.addCar(new Car("Subaru",2.0,Color.BLUE,10_000));
    }

    @Test
    void testCreateCarShop() {

        assertEquals("BestCar", carShop.getCarDealerName());
        assertEquals(15000, carShop.getMaxValueOfCars());
        assertEquals(0,carShop.getCarsForSell().size());
    }

    @Test
    void testAddCar(){
        boolean b = carShop.addCar(new Car("Suzuki",1.7,Color.RED,13000));
        assertTrue(b);
        assertEquals(2,carShop.getCarsForSell().size());
        assertEquals(1.7, carShop.getCarsForSell().get(1).getEngineSize());
    }

    @Test
    void addCarWithInvalidPrice() {
        boolean b = carShop.addCar(new Car("Suzuki",1.7,Color.RED,18000));
        assertFalse(b);
    }
    @Test
    void testSumCarPrice() {
        assertEquals(35_000,carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarCheaperThan() {
        assertEquals(3,carShop.numberOfCarsCheaperThan(10_000));
    }

    @Test
    void testCarsWithBrand() {
    List<Car> subarus = Arrays.asList(carShop.getCarsForSell().get(0),carShop.getCarsForSell().get(3));
    assertEquals(subarus, carShop.carsWithBrand("Subaru"));

    }
}