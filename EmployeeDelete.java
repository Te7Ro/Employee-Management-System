import java.sql.*;
import java.util.*;

public class EmployeeDelete {
    public EmployeeDelete(Connection connection) throws Exception{
        Class.forName("org.postgresql.Driver");

        Employee employee = new Employee(connection);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the id: ");
        int id = scan.nextInt();

        employee.delete(id);
        new Menu().menu(connection);
    }
}
