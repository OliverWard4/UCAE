package Classes;

public class Fruit extends Food {

    private String color;

    public Fruit(int cal, String maker, String color) {
        super(cal, maker);
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String toString() {

        return super.toString() + ", Color: " + color;
    }

}
