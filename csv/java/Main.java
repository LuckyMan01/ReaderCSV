import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        ParserCSVFile parserCSVFile = new ParserCSVFile("folder/grades.csv");
        parserCSVFile.readFileEtReturnCollectLine();
//        List<User> arrayUser = parserCSVFile.fillingUserField();
//        for (int i = 0; i < arrayUser.size(); i++) {
//            System.out.println(arrayUser.get(i));
//        }

        List<Map<String, String>> array = parserCSVFile.mapUserFields();


        for (int i = 1; i < array.size(); i++) {
            System.out.println(array.get(i));
        }


    }
}
