package Parser;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * Created by seth on 11/30/16.
 */
public class SafeDeserializer extends StdDeserializer<Integer> {
    public SafeDeserializer() {
        super(Integer.class);
    }

    @Override
    public Integer deserialize(com.fasterxml.jackson.core.JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            return Integer.valueOf(jsonParser.getValueAsString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
