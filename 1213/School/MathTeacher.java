package School;

public class MathTeacher extends Teacher {

    private String specialty;

    public MathTeacher(String name, int grade, String taughtClass, String specialty) {
        super(name, grade, taughtClass);
        this.specialty = specialty;
    }

    public String getSpeciality(){

        return specialty; 
    }

    public void setSpecialty(String specialty){

        this.specialty = specialty; 
    }

}
