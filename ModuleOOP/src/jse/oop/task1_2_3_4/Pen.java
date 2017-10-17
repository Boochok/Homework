package jse.oop.task1_2_3_4;

class Pen extends Stationery  {

    private final double price;
    private final String producerName;
    private final Color color;


    public Pen(Color color, double price, String producerName) {
        super(price, "Pen");
        this.color = color;
        this.price = price;
        this.producerName = producerName;

    }

    public Pen(Color color, double price) {
        this(color, price, "Some producer");
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public String getProducerName() {
        return producerName;
    }
    public enum Color {
        BLUE {
            public Color otherColor() {
                return BLACK;
            }
        }, BLACK {
            public Color otherColor() {
                return BLUE;
            }
        };

        public abstract Color otherColor();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null == obj)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pen pen = (Pen) obj;
        return pen.price == price && producerName.equals(pen.producerName) && color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = producerName == null ? 0 : 31 * result + producerName.hashCode();
        result = color == null ? 0 : 31 * result + color.hashCode();
        result = 31 * result + (int)price;
        return result;

    }

    @Override
    public String toString() {
        return String.format("Pen: color - %s; price - %.2f; producer - %s",color, price, producerName);
    }


}
