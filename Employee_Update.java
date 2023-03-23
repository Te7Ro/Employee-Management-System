import java.io.*;
import java.util.Scanner;

public class Employee_Update
{
    public void updateFile(int ID) throws Exception, IOException
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
        System.out.println("Please enter the detail you want to Update :\n" +
                "For example :\n" +
                "If you want to Change the name, then Enter Current Name and Press Enter, Then write the new Name then Press Enter.It will Update the Name.\n");
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        File temp = new File("temp.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(temp));

        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            if(line.contains(s))
            {
                System.out.print("Please enter the Updated Info :");
                line=scan.nextLine();
            }
            pw.println(line);
            pw.flush();
        }
        pw.close();
        br.close();
        bufferedReader.close();

        file.delete();
        if(!temp.renameTo(file))
        {
            System.out.println("Hui");
        }

        CodeExit codeExit = new CodeExit();
        codeExit.out();
    }
}
