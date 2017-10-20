package hw.oop.task1_2_3_4;

class Notepad extends Stationery {

    private double price;


    public Notepad(double price){
        super(price, "Notepad");
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return String.format("Notepad: price - %.2f", price);
    }
}
