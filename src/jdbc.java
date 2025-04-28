package shubh;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try {
           

          
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shubh", "root", "sql_73304@W7"
            );
            System.out.println("Connection Successful!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Insert Data
            String createQuery = "CREATE TABLE l ( id INT PRIMARY KEY, name VARCHAR(100));";
            stmt.executeUpdate(createQuery);
            System.out.println("Data Inserted!");

            // 5. Retrieve Data
            String selectQuery = "SELECT * FROM l";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nStudent Table Data:");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

            // 6. Close connection
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
