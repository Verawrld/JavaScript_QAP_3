package Question1;

public class CollegeStudent extends Student {
    protected String myMajor; // major of the college student
    protected int myYear; // year in college (e.g. FROSH = 1, SOPH = 2, etc.)

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}