package lazarus.utilities;

import org.apache.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.sql.*;
import java.util.concurrent.ExecutionException;

public class MySqlAccess {

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public void readDataBase() {

        String path = TestConstants.get_database_credentials();
        String user = Authentication.dataFromTxtFile(path).get("Login");
        String password = Authentication.dataFromTxtFile(path).get("Password");
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/test_constants?"
                            + "user=" + user + "&password=" + password);
            statement = connect.createStatement();
            resultSet = statement
                    .executeQuery("select * from test_constants");
            logger.info(resultSet);

            assert resultSet != null;
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}