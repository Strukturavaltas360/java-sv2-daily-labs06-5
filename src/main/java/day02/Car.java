package day02;

public class Car {
    private String type;
    private double engineSize;
    private Color color;
    private int price;


    public void decreasePrice(int percent) {
        price = (int) (price * (1 - percent/100d));
    }

    public Car(String type, double engineSize, Color color, int price) {
        this.type = type;
        this.engineSize = engineSize;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
