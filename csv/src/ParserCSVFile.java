import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ParserCSVFile {
    private String lastName;
    private String firstName;
    private String ssn;
    private double test1;
    private double test2;
    private double test3;
    private double test4;
    private double finalTest;
    private String grade;

    private final int sizeColumn = 9;
    private String fileName = "folder/grades.csv";
    private LinkedList<String> array = new LinkedList<>();
    private File file = new File(fileName);
    private ArrayList<String> titleArray = new ArrayList<>();

    public ArrayList<String> getTitleArray() {
        return titleArray;
    }

    public ParserCSVFile() {


    }

    public ArrayList<User> parserCsv() {
        int count = 0;
        ArrayList<User> users = new ArrayList<>();
        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                count++;
                if (count <= 9) {
                    titleArray.add((data.split(",").toString()));
                }

                if (count > 10) {
                    String[] value = (data.split(","));
                    array.add(value[0]);
                }
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        count = 0;
        for (int i = 0; i < array.size(); i++) {
            count++;
            if (count == 0) {
                lastName = array.get(i).toString();
            } else if (count == 1) {
                firstName = array.get(i).toString();
            } else if (count == 2) {
                ssn = array.get(i).toString();
            } else if (count == 3) {
                test1 = Double.parseDouble(array.get(i));
            } else if (count == 4) {
                test2 = Double.parseDouble(array.get(i));
            } else if (count == 5) {
                test3 = Double.parseDouble(array.get(i));
            } else if (count == 6) {
                test4 = Double.parseDouble(array.get(i));
            } else if (count == 7) {
                finalTest = Double.parseDouble(array.get(i));
            } else if (count == 8) {
                grade = array.get(i);
            } else {
                users.add(new User(lastName, firstName, ssn, test1, test2, test3, test4, finalTest, grade));
                count = 0;
            }

        }
        return users;
    }
}
