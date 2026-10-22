
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionDemo {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(
                    "Error: The file does not exist."
            );

        } catch (IOException e) {
            System.out.println(
                    "Error: A problem occurred while reading the file."
            );
        }
    }
}
