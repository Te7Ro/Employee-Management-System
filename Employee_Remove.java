import java.io.File;

public class Employee_Remove implements Remove{
    public void removeFile(int ID) throws Exception
    {
        File file = new File("file"+ID+".txt");
        if(!file.exists())
        {
            System.out.println("\nEmployee does not exists");
        }
        else
        {
            file.delete();
            System.out.println("\nEmployee has been removed Successfully\n");
            CodeExit codeExit = new CodeExit();
            codeExit.out();
        }
    }
}
