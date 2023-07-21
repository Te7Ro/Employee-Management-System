import java.sql.*;

public class EmployeeSelect {
    public EmployeeSelect(Connection connection) throws Exception{
        Class.forName("org.postgresql.Driver");

        Employee employee = new Employee(connection);
        employee.select();
        Menu menu = new Menu();
        menu.menu(connection);
    }
}
