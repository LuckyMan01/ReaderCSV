import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParserCSVFile {
    private String fileName;
    private List<String> arrayLine = new ArrayList<>();

    public List<String> readFileEtReturnCollectLine(String file) {
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
        return arrayLine;
    }
}
