import java.sql.*;

public class updateData {
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
            String sql = "UPDATE employee SET Employee_first_name='Kishore' WHERE Employee_id='5'";
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Rows Affected :: "+rowsAffected);
            System.out.print("Updated the Data to the table Successfully");
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

