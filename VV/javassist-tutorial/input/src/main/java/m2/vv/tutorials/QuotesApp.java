package m2.vv.tutorials;

import java.io.FileWriter;
import java.io.IOException;

public class QuotesApp {

    public static void main(String[] args) {

        Quote[] quotes = {
                new Quote("HAL", "I’m sorry, Dave. I’m afraid I can’t do that."),
                new Quote("Uncle Ben", "With great power there must also come — great responsibility."),
                new Quote("Dr McCoy", "He’s dead, Jim."),
                new Quote("Yoda", "Do, or do not. There is no try."),
                new Quote("Hodor", "Hodor")
        };

        try {
            FileWriter writer = new FileWriter("output.txt");
            FileUtils.writeQuotes(writer, quotes);
            writer.close();
        }
        catch(IOException exc) {
            System.out.println("Something went wrong.");
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }

    }
}
