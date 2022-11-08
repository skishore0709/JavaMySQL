import java.sql.*;

public class insertData {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;

        String url = "jdbc:mysql://localhost:3306/?employees";
        String user = "root";
        String password = "ADMind@2k22";

        try {
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            String sql = "INSERT INTO employee (employee_first_name, employee_last_name,Employee_Address,Employee_department_ID) values ('Karthik','Vel', 'Ramanathapuram', '107')";
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Rows Created :: "+rowsAffected);
            System.out.print("Created the Data to the table Successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (stmt!=null){
                stmt.close();
            }
            if (conn!=null){
                conn.close();
            }
        }
    }
}