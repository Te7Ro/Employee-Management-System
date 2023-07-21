import java.sql.*;

public class Employee {
    private Connection connection;

    public Employee(Connection connection){
        this.connection=connection;
    }

    public void insert(String first_name, String last_name,String email,String gender) throws Exception{
        Class.forName("org.postgresql.Driver");
        String sql = String.format("INSERT INTO employee (first_name, last_name, email, gender) VALUES ('%s','%s','%s','%s');",first_name,last_name,email,gender);

        Statement statement = connection.createStatement();

        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Record created successfully");
    }

    public void update(int id, String first_name,String last_name,String email,String gender) throws Exception{
        Class.forName("org.postgresql.Driver");
        String sql = String.format("UPDATE employee SET first_name = '%s', last_name = '%s', email = '%s', gender = '%s' WHERE id=%d;",
                first_name,last_name,email,gender,id);

        Statement statement = connection.createStatement();

        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Record updated successfully");
    }

    public void delete(int id) throws Exception{
        Class.forName("org.postgresql.Driver");
        String sql = String.format("DELETE FROM employee WHERE id=%d;",id);

        Statement statement = connection.createStatement();

        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Record deleted successfully");
    }

    public void select() throws Exception{
        Class.forName("org.postgresql.Driver");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM employee;");
        while(rs.next()){
            String str = rs.getString(1) + " | " + rs.getString(2) +
                    " | " + rs.getString(3) + " | " + rs.getString(4)+
                    " | " + rs.getString(5);
            System.out.println("Employee: "+str);
        }
        rs.close();
        statement.close();
    }
}
