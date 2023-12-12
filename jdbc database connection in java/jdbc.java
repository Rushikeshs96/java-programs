import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            // Load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac", "root", "root");
            System.out.println("Connection established");

            // Create a statement
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM emp");

            System.out.println("EMPNO   ENAME"); // Assuming the columns are EMPNO and ENAME

            // Process the result set
            while (rs.next()) {
                // Retrieve data by column names or indices and print with appropriate formatting
                System.out.println(rs.getInt("EMPNO") + "   " + rs.getString("ENAME"));
            }

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
