import java.sql.*;

public class Main{

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "secret";
        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from mydb.Contacts";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next())

                System.out.println(rs.getString("name"));   

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}