package lazarus.utilities;


import com.sun.mail.smtp.SMTPTransport;
import lazarus.steps.StepHelper;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class Mail extends StepHelper {

    public static void sender() {

        Properties prop = System.getProperties();
        prop.put("mail.smtp.host", TestConstants.email_settings().get("smtp_server"));
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", TestConstants.email_settings().get("port"));
        prop.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {
            // from
            msg.setFrom(new InternetAddress(TestConstants.email_settings().get("email_from")));

            // to
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(TestConstants.email_settings().get("email_to"), false));

            // cc
            msg.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(TestConstants.email_settings().get("email_to_cc"), false));

            // subject
            msg.setSubject(TestConstants.email_settings().get("email_subject"));

            // content
            msg.setText(TestConstants.email_settings().get("email_text"));

            msg.setSentDate(new Date());

            // Get SMTPTransport
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");

            // connect
            t.connect(TestConstants.email_settings().get("smtp_server"), TestConstants.email_settings().get("username"), TestConstants.email_settings().get("password"));

            // send
            t.sendMessage(msg, msg.getAllRecipients());

            logger.info("Response: " + t.getLastServerResponse());

            t.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
