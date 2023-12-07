import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        // Open this file.
        BufferedReader reader = new BufferedReader(new FileReader(
                "/Users/USER/OneDrive/桌面/TriviaSample.txt"));

        // Read lines from file.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            // Split line on comma.
            String[] parts = line.split(",");
            for (String part : parts) {
                System.out.println(part);
            }
            System.out.println();
        }

        reader.close();
    }
}
