import java.io.FileOutputStream;
import java.io.IOException;

public class writeData {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("C:\\Users\\Rushikesh\\Desktop\\github\\java-programs\\fileoutputStream example text file\\abc.txt");

            f.write(3500);
            f.close();

            System.out.println("Success: Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
