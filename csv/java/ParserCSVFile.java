import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParserCSVFile {
    private final List<String> arrayLine = new ArrayList<>();
    private final String SEPARATOR = ",";
    private String file;

    public ParserCSVFile(String file) {
        this.file = file;
    }

    public List<String> readFileEtReturnCollectLine() {
        File newFile = new File(file);
        try {
            FileReader fr = new FileReader(newFile);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                arrayLine.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayLine.remove(0);
        return arrayLine;

    }

    public List<User> fillingUserField() {

        List<User> arrayUser = new ArrayList<>();
        for (int i = 0; i < arrayLine.size(); i++) {
            User user = new User();
            String[] fieldUser = arrayLine.get(i).split(SEPARATOR);
            user.setLastName(fieldUser[Fields.LAST_NAME.getIndex()]);
            user.setFirstName(fieldUser[Fields.FIRST_NAME.getIndex()]);
            user.setSsn(fieldUser[Fields.SSN.getIndex()]);
            user.setTest1(Double.parseDouble(fieldUser[Fields.TEST1.getIndex()]));
            user.setTest2(Double.parseDouble(fieldUser[Fields.TEST2.getIndex()]));
            user.setTest3(Double.parseDouble(fieldUser[Fields.TEST3.getIndex()]));
            user.setTest4(Double.parseDouble(fieldUser[Fields.TEST4.getIndex()]));
            user.setFinalTest(Double.parseDouble(fieldUser[Fields.FINAL.getIndex()]));
            user.setGrade(fieldUser[Fields.GRADE.getIndex()]);
            arrayUser.add(user);
        }

        return arrayUser;
    }
}
