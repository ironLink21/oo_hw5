package Parser;

import Person.Bucket;

import java.io.File;
import java.util.regex.Pattern;

/**
 * Created by seth on 11/30/16.
 */
public interface Parser {
    Bucket openFile(String location) throws Exception;

    public static Parser create(String location) {
        Pattern json = Pattern.compile("(.json)$");
        Pattern xml = Pattern.compile("(.xml)$");

        String locationPath = new File(location).getAbsolutePath();

        if(json.matcher(locationPath).find()) {
            return new JsonParser();

        } else if (xml.matcher(locationPath).find()) {
            return new XmlParser();

        } else {
            return null;
        }
    }

}
