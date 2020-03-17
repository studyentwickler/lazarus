package lazarus.utilities;

import java.util.HashMap;

public class TestConstants {

    /**
     * This method don't take any argument,
     * it returns just the path to txt file with credentials
     *
     * @return String path to database credentials
     */
    public static String get_database_credentials() {
        return "/opt/database.txt";
    }

    public static String get_email_credentials() {
        return "/Users/wahl/authentication.txt";
    }

    public static HashMap<String, String> email_settings() {

        HashMap<String, String> settings = new HashMap<String, String>();

        String user = Authentication.dataFromTxtFile(get_email_credentials()).get("Login");
        String password = Authentication.dataFromTxtFile(get_email_credentials()).get("Password");

        settings.put("smtp_server", "smtp.yandex.ru");
        settings.put("port", "465");
        settings.put("username", user);
        settings.put("password", password);
        settings.put("email_from", "jenkins@alexanderwahl.eu");
        settings.put("email_to", "waal.mos@gmail.com");
        settings.put("email_to_cc", "");
        settings.put("email_subject", "Test Send Email via SMTP");
        settings.put("email_text", "Hello Java Mail \n ABC123");

        return settings;
    }

}
