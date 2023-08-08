package org.czirman.satago;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParseJSONTest {

    ParseJSON parseJSON = new ParseJSON();

    @Test
    public void testStringToParse(){
        String in = "{\"phonetype\":\"N95\",\"cat\":\"WP\"}";
        String in2 = "{\"name\": \"Jane Doe\",\"favorite-game\": \"Stardew Valley\",\"subscriber\": false}";
        String in3 = "{\"categories\": [\"dev\"],\"created_at\": \"2020-01-05 13:42:19.324003\",\"icon_url\": \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\"id\": \"elgv2wkvt8ioag6xywykbq\",\"updated_at\": \"2020-01-05 13:42:19.324003\",\"url\": \"https://api.chucknorris.io/jokes/elgv2wkvt8ioag6xywykbq\",\"value\": \"Chuck Norris's keyboard doesn't have a Ctrl key because nothing controls Chuck Norris.\"}";
        String complicated = "{\"categories\": [\"dev,add\"],\"embeded\": {\"internal1\": \"ala\",\"internal2\": \"alem\"},\"id\": \"elgv2wkvt8ioag6xywykbq\",\"updated_at\": \"2020-01-05 13:42:19.324003\"}";
        JSONObject parsed = (JSONObject) parseJSON.parse(complicated);

        assertTrue(true);
    }
}
