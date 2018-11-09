
/**
 * Import the necessary Java packages
 */

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Scanner;

/**
 * A Mapreduce example for Hadoop. It extracts some basic
 * information from a text file derived from the DBLP dataset.
 */
public class Authors {

    /**
     * The Mapper class -- it takes a line from the input file and
     * extracts the string before the first tab (= the author name)
     */
    public static class AuthorsMapper extends
            Mapper<Object, Text, Text, IntWritable> {

        private final static IntWritable one = new IntWritable(1);
        private Text author = new Text();

        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {
//            System.out.println(new String(value.getBytes()));
            /* Open a Java scanner object to parse the line */
            Scanner line = new Scanner(value.toString());
            line.useDelimiter("\t");
            String next = line.next();
            if (next.contains("David Gross-Amblard")) {
                author.set(next);
                context.write(author, one);
            }
        }
    }

    /**
     * The Reducer class -- receives pairs (author, <list of counts>)
     * and sums up the counts of publications per author
     */
    public static class CountReducer extends
            Reducer<Text, IntWritable, Text, IntWritable> {
        private IntWritable result = new IntWritable();

        public void reduce(Text key, Iterable<IntWritable> values,
                           Context context)
                throws IOException, InterruptedException {

            /* Iterate on the list to compute the count */
            int count = 0;
            for (IntWritable val : values) {
                count += val.get();
            }

            result.set(count);
            context.write(key, result);
        }
    }
}
