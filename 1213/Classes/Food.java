package Classes;

public class Food {


    private int cal;
    private String maker;
    public static int count; 

    public Food(int cal, String maker) {
        this.cal = cal;
        this.maker = maker;
        count++; 
    }

    public Food(int cal) {
        this.cal = cal;
        this.maker = null;
        count++;
    }

    public Food() {
        this.cal = 0;
        this.maker = null;
        count++;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String farmer) {
        maker = farmer;
    }

    public String toString() {

        return "cal: " + cal + ", maker: " + maker;
    }

}
