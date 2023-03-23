import java.util.Scanner;

public class CodeExit {
    public void out() throws Exception
    {
        System.out.println("Press enter to continue...");
        new Scanner(System.in).nextLine();
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu();
    }
}
