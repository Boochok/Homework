package hw.oop.task1_2_3_4;

class Stationery {

    public double getPrice() {
        return price;
    }

    private double price;

    public String getName() {
        return name;
    }

    private String name;

    public Stationery() {
    }

    public Stationery(double price, String name) {
        this.price = price;
        this.name = name;
    }
}
