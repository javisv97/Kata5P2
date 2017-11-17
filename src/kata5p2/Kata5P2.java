package kata5p2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata5P2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        
        ArrayList<String> arrayMail = MailListReaderDDBB.readDDBB();
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();
                
       
    }
}
