
public class User {
    private String lastName;
    private String firstName;
    private String ssn;
    private double test1;
    private double test2;
    private double test3;
    private double test4;
    private double finalTest;
    private String grade;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }

    public void setTest3(double test3) {
        this.test3 = test3;
    }

    public void setTest4(double test4) {
        this.test4 = test4;
    }

    public void setFinalTest(double finalTest) {
        this.finalTest = finalTest;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User " +
                "lastName= " + lastName + '\'' +
                ", firstName= " + firstName + '\'' +
                ", ssn= " + ssn + '\'' +
                ", test1=" + test1 +
                ", test2=" + test2 +
                ", test3=" + test3 +
                ", test4=" + test4 +
                ", finalTest=" + finalTest +
                ", grade= " + grade + '\'';
    }
}
