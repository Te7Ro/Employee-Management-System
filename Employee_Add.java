import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee_Add extends EmployDetail {
    public void createFile() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        String name=scan.nextLine();
        if(name.matches("[0-9]"))throw new InputMismatchException("Input is int instead of String");
        System.out.print("Enter Employee's age -: ");
        int age = scan.nextInt();
        if(age<1)throw new Exception("Age can not be less than 1");
        System.out.print("Enter Employee's ID ----------: ");
        int employ_id = scan.nextInt();
        if(employ_id<0)throw new Exception("ID can not be less than 0");
        System.out.print("Enter Employee's Email ID ----: ");
        String email= scan.next();
        if(!email.matches("[a-zA-Z0-9]+@[a-z]+.[a-z]+"))throw new InputMismatchException("Email address is incorrect");
        System.out.print("Enter Employee's Position ----: ");
        String position = scan.next();
        if(position.matches("[0-9]"))throw new InputMismatchException("Input is int instead of String");
        System.out.print("Enter Employee contact info --: ");
        long employ_contact = scan.nextLong();
        if(employ_contact<0)throw new Exception("Contact number can not be less than 0");
        System.out.print("Enter Employee's Salary ------: ");
        float employ_salary = scan.nextFloat();
        if(employ_salary<0)throw new Exception("Salary can not be less than 0");
        System.out.println("\n");

        employee_detail(employ_contact, employ_salary, employ_id, position, email, age, name);
    }
}
