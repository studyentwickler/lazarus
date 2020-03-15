package lazarus.utilities;

import lazarus.steps.StepHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Authentication extends StepHelper {

    /**
     * It takes a String, the String is your full path to txt file like
     * "/Users/nameOfUser/someplace/testing/data.txt",
     * in which you should write 2 values with a new line:
     * - on the first line should be login,
     * - on the second should be password.
     * <p>
     * This method returns object HashMap,
     * You should use the methods of HashMap using keys: "Login" or "Password"
     * to get desired value.
     *
     * @param path of the txt file with authentication data
     * @return authenticationData HashMap<String, String>
     */
    public static HashMap<String, String> jenkinsEmail(String path) {

        ArrayList<String> temporaryArray = new ArrayList<String>();
        HashMap<String, String> authenticationData = new HashMap<String, String>();
        BufferedReader reader;
        FileReader file;

        try {

            file = new FileReader(path);
            reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {

                temporaryArray.add(line);
                line = reader.readLine();

            }

            authenticationData.putIfAbsent("Login", temporaryArray.get(0));
            authenticationData.putIfAbsent("Password", temporaryArray.get(1));

            reader.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return authenticationData;
    }

}
