package School;

import org.omg.CORBA.ExceptionList;

public class Teacher extends ADT_Teacher {

    private String name;
    private int grade;
    private String taughtClass;

    public Teacher(String name, int grade, String taughtClass) {

        this.name = name;
        this.grade = grade;
        this.taughtClass = taughtClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        this.grade = grade;
    }

}
