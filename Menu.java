import java.util.Scanner;
import java.sql.Connection;

public class Menu {
    public void menu(Connection connection) throws Exception
    {
        System.out.println(
                "       *******************************************\n" +
                "            Organizational Management System\n" +
                "       *******************************************\n\n\n");
        System.out.println("Press 1 : Add an Employee Details");
        System.out.println("Press 2 : See an Employee Details");
        System.out.println("Press 3 : Remove the Employee");
        System.out.println("Press 4 : Update Employee Details");
        System.out.println("Press 5 : Leave the program");
        System.out.print("Please Enter choice: ");

        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();

        switch(check)
        {
            case 1:
                new EmployeeAdd(connection);
                break;
            case 2:
                new EmployeeSelect(connection);
                break;
            case 3:
                new EmployeeDelete(connection);
                break;
            case 4:
                new EmployeeUpdate(connection);
                break;
            case 5:
                new CodeExit(connection);
                break;
            default:
                System.out.println("Incorrect input");
                this.menu(connection);
                break;
        }
    }
    
}
