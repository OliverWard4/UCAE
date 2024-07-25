package OverlodaingPrac;

public class School {

    private String prin;
    private int grades;

    public School() {
        prin = "n/a";
        grades = 0;
    }

    public School(int grades) {
        this.grades = grades;
    }

    public School(String prin) {
        this.prin = prin;
    }

    public School(int blue, String purp) {

        prin = purp;
        grades = blue;

    }

    public String ToString() {

        return prin + ", " + grades;

    }

}
