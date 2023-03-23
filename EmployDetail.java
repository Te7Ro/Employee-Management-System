import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

abstract class EmployDetail {
    private long employ_contact;
    private float employ_salary;
    private int employ_id;
    private String position;
    private String email;
    private int age;
    private String name;

    public void employee_detail(long employ_contact,float employ_salary,int employ_id,String position,String email,int age,String name) throws IOException,Exception {
        this.employ_contact=employ_contact;
        this.employ_salary=employ_salary;
        this.employ_id=employ_id;
        this.position=position;
        this.email=email;
        this.age=age;
        this.name=name;
        File file = new File("file" + employ_id + ".txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file));

        String line = name + "\n" + age + "\n" + email + "\n" + position + "\n" + employ_id + "\n" + employ_salary + "\n" + employ_contact;
        pw.println(line);
        pw.flush();
        pw.close();
        System.out.println("Employee has been Added :)");
        CodeExit codeExit = new CodeExit();
        codeExit.out();
    }
}
