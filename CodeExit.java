import java.sql.*;

public class CodeExit {

    public CodeExit(Connection connection) throws Exception{
        connection.close();
        System.exit(0);
    }
    
}
