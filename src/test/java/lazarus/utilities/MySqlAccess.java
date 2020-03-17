package lazarus.utilities;

import org.apache.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.sql.*;

public class MySqlAccess {

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public void readDataBase() throws Exception {

        String path = TestConstants.get_database_credentials();
        String user = Authentication.dataFromTxtFile(path).get("Login");
        String password = Authentication.dataFromTxtFile(path).get("Password");

        private Connection connect = null;
        private Statement statement = null;
        private PreparedStatement preparedStatement = null;
        private ResultSet resultSet = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/test_constants?"
                            + "user=" + user + "&password=" + password);
            statement = connect.createStatement();
            resultSet = statement
                    .executeQuery("select * from test_constants");
            logger.info(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
    }

}
