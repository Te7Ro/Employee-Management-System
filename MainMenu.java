import java.nio.charset.IllegalCharsetNameException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;

public class MainMenu {
    private int check;
    public void menu() throws Exception
    {
        System.out.println(
                "       *******************************************\n" +
                "            Organizational Management System\n" +
                "       *******************************************\n\n\n");
        System.out.println("Press 1 : Add an Employee Details");
        System.out.println("Press 2 : See an Employee Details");
        System.out.println("Press 3 : Remove the Employee");
        System.out.println("Press 4 : Update Employee Details");
        System.out.println("Press 5 : Exit the EMS Portal\n");
        System.out.print("Please Enter choice: ");
        Scanner scan = new Scanner(System.in);
        int ID;
        check = scan.nextInt();
        switch (check)
        {
            case 1:
                Employee_Add employee_add = new Employee_Add();
                employee_add.createFile();
                break;
            case 2:
                Employee_Show employee_show = new Employee_Show();
                System.out.print("Please Enter the Employee's ID :");
                int id= scan.nextInt();
                employee_show.viewFile(id);
                break;
            case 3:
                System.out.print("Please Enter Employee's ID :");
                ID= scan.nextInt();
                Employee_Remove employee_remove = new Employee_Remove();
                employee_remove.removeFile(ID);
                break;
            case 4:
                System.out.print("Please Enter Employee's ID :");
                ID= scan.nextInt();
                Employee_Update employee_update = new Employee_Update();
                employee_update.updateFile(ID);
                break;
            case 5:
                System.out.println(
                                "\n" +
                                "******************************************\n" +
                                "  Thank You For Sharing your details :)\n" +
                                "******************************************");
        }
    }
}
