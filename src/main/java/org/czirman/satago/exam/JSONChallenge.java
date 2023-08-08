package org.czirman.satago.exam;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONChallenge {


    public static void jsonChallenge() {

    }

    public static void main(String[] args) {

    }

    public static JSONObject parse(String json) {
        JSONObject jsonObject = null;

        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException err) {
            System.out.println(err);
        }
        return jsonObject;
    }
}