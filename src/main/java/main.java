import Parser.Parser;
import Person.Bucket;

import java.io.File;

/**
 * Created by seth on 11/28/16.
 */
public class main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/PersonTestSet_01.json");
//        File file = new File("documents/test_data/PersonTestSet_11.xml");

        if(file.exists()) {
            String fileSt = file.getAbsolutePath();
            Parser parser = Parser.create(fileSt);
//            Matcher matcher = new Matcher();

            if(parser == null) {
                System.out.print("Incorrect File Type");
                return;
            }

            Bucket bucket = parser.openFile(fileSt);

            // run matchers
//            MatchesBucket matchesBucket = matcher.findMatches(bucket);
//
//            // print results
//            results print = new results();
//            print.print(matchesBucket, "documents/matches.txt");
        }
    }
}

