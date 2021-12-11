import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ParserCSVFile parser = new ParserCSVFile();

        ArrayList<User> array = parser.parserCsv();

        for (int i = 0; i < array.size();i++){
            System.out.println(array.get(i));
        }
    }
}


