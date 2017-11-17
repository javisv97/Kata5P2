package kata5p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReaderDDBB {
    
    public static ArrayList<String> readDDBB() throws ClassNotFoundException, SQLException {
        ArrayList <String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:Kata5.db");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT Mail FROM MAILS;");
        
        while (rs.next()) {
            String mail = rs.getString("mail");
            if (!mail.contains("@")) continue;
            mailList.add(mail);
        }
        return mailList;
    }
}
