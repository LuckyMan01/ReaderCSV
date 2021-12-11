import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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


    public User(String lastName, String firstName, String ssn, double test1, double test2, double test3, double test4, double finalTest, String grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.finalTest = finalTest;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", test1=" + test1 +
                ", test2=" + test2 +
                ", test3=" + test3 +
                ", test4=" + test4 +
                ", finalTest=" + finalTest +
                ", grade='" + grade + '\'' +
                '}';
    }
}
