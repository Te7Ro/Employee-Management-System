import java.sql.*;

public class Main{
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/javadb";
        String user = "postgres";
        String password = "haha@123";
        
        try(Connection connection = DriverManager.getConnection(url, user, password);){
            new Menu().menu(connection);
        }
        catch(Exception ex)
        {
            System.out.println("Connection failed");
            System.out.println(ex);
        }
    }
}