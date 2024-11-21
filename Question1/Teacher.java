package Question1;

public class Teacher extends Person {
    protected String mySubject; // subject the teacher teaches
    protected double mySalary; // teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}
