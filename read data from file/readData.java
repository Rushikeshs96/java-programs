import java.io.FileInputStream;

public class readData {
    public static void main(String[] args) {
        
        try {
            FileInputStream f=new FileInputStream("C:\\Users\\Rushikesh\\Desktop\\github\\java-programs\\fileoutputStream example text file\\abc.txt");

            int i;

            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }

            f.close();

        }
         catch (Exception e) {
           e.getMessage();
        }
    }
}
