import java.sql.*;
import java.util.*;

public class EmployeeAdd {
    public EmployeeAdd(Connection connection) throws Exception{
        Class.forName("org.postgresql.Driver");

        Employee employee = new Employee(connection);
        String first_name,last_name,email,gender;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        first_name = scan.nextLine();
        System.out.print("Enter the last name: ");
        last_name = scan.nextLine();
        System.out.print("Enter the email: ");
        email = scan.nextLine();
        System.out.print("Enter the gender: ");
        gender = scan.nextLine();

        employee.insert(first_name, last_name, email, gender);
        new Menu().menu(connection);
    }
    
}
