package kata5;
import java.sql.*;


import kata5.view.HistogramDisplay;
import kata5.model.persistence.MailDatabaseReader;
import kata5.view.MailHistogramBuilder;
import kata5.model.Histogram;
import kata5.model.Mail;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String databaseName = new String("us500.db");
        List<Mail> mailList = MailDatabaseReader.read(databaseName);

        Histogram<String> histogram = MailHistogramBuilder.build(mailList);

        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();


    }

}