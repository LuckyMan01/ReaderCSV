import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParserCSVFile parserCSVFile = new ParserCSVFile();
        List<String> array = parserCSVFile.readFileEtReturnCollectLine("csv/folder/grades.csv");
        for (int i = 0; i < array.size();i++){
            System.out.println(array.get(i));
        }

    }
}


