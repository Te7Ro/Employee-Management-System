import java.sql.*;
import java.util.*;

public class EmployeeUpdate {
    public EmployeeUpdate(Connection connection) throws Exception{
        Class.forName("org.postgresql.Driver");

        Employee employee = new Employee(connection);
        Scanner scan = new Scanner(System.in);
        int id;
        String first_name,last_name,email,gender;

        System.out.print("Enter the id: ");
        id = scan.nextInt();
        System.out.print("Enter the first name: ");
        first_name = scan.next();
        System.out.print("Enter the last name: ");
        last_name = scan.next();
        System.out.print("Enter the email: ");
        email = scan.next();
        System.out.print("Enter the gender: ");
        gender = scan.next();

        employee.update(id, first_name, last_name, email, gender);
        new Menu().menu(connection);
    }
}
