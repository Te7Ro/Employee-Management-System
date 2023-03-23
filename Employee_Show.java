import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Employee_Show {
    public void viewFile(int ID) throws Exception
    {
        File file = new File("file"+ID+".txt");
        Scanner br = new Scanner(file);
        if(!file.exists())
        {
            System.out.println("\nEmployee des not exists");
            System.exit(0);
        }
        while(br.hasNext())
        {
            String name = br.nextLine();
            int age = br.nextInt();
            String email = br.next();
            String position = br.next();
            int id = br.nextInt();
            float salary = br.nextFloat();
            long contact = br.nextLong();
            System.out.println("Employee ID:"+id);
            System.out.println("Employee Name       "+name);
            System.out.println("Age      "+age);
            System.out.println("Employee Contact    "+contact);
            System.out.println("Email Information   "+email);
            System.out.println("Employee position   "+position);
            System.out.println("Employee Salary     "+salary+"\n\n");
        }
        CodeExit codeExit = new CodeExit();
        codeExit.out();
    }
}
