import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadATextFile {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String stringLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/kevinstradtman/Desktop/Development/Java/DataStructuresAndMore/filesize.txt"));
            while (stringLine != null) {
                sb.append(stringLine);
                sb.append(System.lineSeparator());
                stringLine = br.readLine();
                System.out.println(stringLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
