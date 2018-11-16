package m2.vv.tutorials;

import java.io.FileWriter;

public class FileUtils {

    public static int writeQuotes(FileWriter writer, Quote[] quotes, int start, int length) throws java.io.IOException {

        int end = Math.min(start + length, quotes.length);
        int count = 0;

        for(int i = start; i < end; i++, count++)
            FileUtils.writeQuote(writer, quotes[i]);
        return count;
    }

    public static void writeQuotes(FileWriter writer, Quote[] quotes) throws java.io.IOException {
        FileUtils.writeQuotes(writer, quotes, 0, quotes.length);
    }

    public static void writeQuote(FileWriter file, Quote quote) throws java.io.IOException {
        file.write(quote.toString() + "\n");
    }

}
