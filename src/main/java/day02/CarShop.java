package day02;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String carDealerName;
    private int maxValueOfCars;
    private List<Car> CarsForSell = new ArrayList<>();

    public boolean addCar(Car car){
        boolean b = false;
        if (car.getPrice() <= maxValueOfCars) {
            b = CarsForSell.add(car);
        }
        return b;
    }

    public int sumCarPrice() {
        int sumPrice = 0;
        for (Car actual: CarsForSell) {
            sumPrice += actual.getPrice();
        }
        return sumPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int pieces = 0;
        for (Car actual: CarsForSell) {
            if (actual.getPrice() <= price) {
                pieces ++;
            }
        }
        return pieces;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> resultCars = new ArrayList<>();
        for (Car actual: CarsForSell) {
            if (actual.getType().equals(brand)) {
                resultCars.add(actual);
            }
        }
        return resultCars;
    }

    public CarShop(String carDealerName, int maxValueOfCars) {
        this.carDealerName = carDealerName;
        this.maxValueOfCars = maxValueOfCars;
    }

    public String getCarDealerName() {
        return carDealerName;
    }

    public int getMaxValueOfCars() {
        return maxValueOfCars;
    }

    public List<Car> getCarsForSell() {
        return CarsForSell;
    }
}
