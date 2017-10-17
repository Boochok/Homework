package jse.oop.task1_2_3_4;

class Pencil extends Stationery {

    private double price;

    public Pencil(double price) {
        super(price, "Pencil");
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return String.format("Pencil: price - %.2f", price);
    }

}
