package jse.oop.task1_2_3_4;

class Eraser extends Stationery {

    private double price;

    public Eraser(double price) {
        super(price, "Eraser");
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return String.format("Eraser: prise = %.2f", price);
    }
}
