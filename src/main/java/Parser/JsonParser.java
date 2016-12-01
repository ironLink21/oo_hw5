package Parser;

import Person.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by seth on 11/30/16.
 */
public class JsonParser implements Parser {

    @Override
    public void openFile(String location) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>(){};
        ArrayList<Person> bucketArr = mapper.readValue(new File(location), type);

        new Bucket(bucketArr);
    }
}
