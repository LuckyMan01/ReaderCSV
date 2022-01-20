import java.util.List;
public class Main {
    public static void main(String[] args) {
        ParserCSVFile parserCSVFile = new ParserCSVFile("folder/grades.csv");
        parserCSVFile.readFileEtReturnCollectLine();
        List<User> arrayUser = parserCSVFile.fillingUserField();
        for (int i = 0; i < arrayUser.size();i++){
            System.out.println(arrayUser.get(i));
        }
    }
}
