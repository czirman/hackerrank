package org.czirman.satago;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseJSON {

    public static JSONObject parse(String json) {
        JSONObject jsonObject = null;

        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException err) {
            System.out.println(err);
        }
        return jsonObject;
    }

    public static void main(String[] args) {
        String str = "{\"No\":17,\"Name\":\"Andrew\",\"emb\":{\"one\":\"ddd\",\"on1\":\"ddd\",\"on3\":\"ddd\"},\"tab\":[\"LOL\",\"MID\",\"CAR\"],\"en\":\"MID1\"}";
        JSONObject jsonObject = parse(str);

        // TODO ogar to i inne jsonoe  metody
        nones dana = jsonObject.getEnum(nones.class, "en");

        //Map dana = jsonObject.toJSONArray();
        //Object dana = jsonObject.get("enum");

        System.out.println("###################  " + dana + "  ###################");
    }

    enum nones {CAR, LOL, MID}

    ;
}
/*
        obada ten similar bo moze sie przydac
        String str = "{\"No\":17,\"Name\":\"Andrew\",\"emb\":{\"one\":\"ddd\",\"on1\":\"ddd\",\"on3\":\"ddd\"},\"enum\":[\"LOL\",\"MID\",\"CAR\"]}";

        String oth = "{\"No\":17,\"Name\":\"Andrew\",\"emb\":{\"one\":\"ddd\",\"on1\":\"ddd\",\"on3\":\"ddd\"},\"enum\":[\"LOL\",\"MID\",\"CAR\"]}";
 */
