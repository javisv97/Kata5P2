package kata5p2;

import java.io.IOException;
import java.util.ArrayList;

public class Kata5P2 {

    public static void main(String[] args) throws IOException {
        String nameFile = "emails.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();
        
    }
}
