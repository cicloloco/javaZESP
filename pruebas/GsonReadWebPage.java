package pruebas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import jsonZESP.ZP_Event;

import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

class TimeData {

    private String time;
    private Long milliseconds_since_epoch;
    private String date;

    @Override
    public String toString() {
        return "TimeData{" + "time=" + time + ", milliseconds_since_epoch="
                + milliseconds_since_epoch + ", date=" + date + '}';
    }
}

public class GsonReadWebPage {

    public static void main(String[] args) throws IOException {

        String webPage = "http://time.jsontest.com";
        JsonElement data, js_event;
        JsonArray jsonArray;
        ZP_Event zpEvent;

    	//Prefijo de la URL de zwiftpower
    	String apiURL = "https://www.zwiftpower.com/api3.php?do=race_history";
    	
    	InputStream is = new URL(apiURL).openStream();
    	Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(reader);
        Gson gson = new Gson();
        
        if(jsonTree.isJsonObject()) {
            System.out.println("Es un JsonObject");
            JsonObject jsonObject = jsonTree.getAsJsonObject();
            data = jsonObject.get("data");
            if(data.isJsonArray()) {
                System.out.println("data es un array");
                jsonArray = data.getAsJsonArray();
                js_event = jsonArray.get(0);
                zpEvent = gson.fromJson(jsonArray.get(0), ZP_Event.class);
//                System.out.println("Datos[0]: " + aux.getAsString());
                System.out.println("Aquí me paro");
            }
        }
        
// http://tutorials.jenkov.com/java-json/gson-jsonparser.html
//https://github.com/google/gson
        
        System.out.println("Aquí me paro");

/*
        try (InputStream is = new URL(webPage).openStream();
                Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {

            Gson gson = new Gson();
            TimeData td = gson.fromJson(reader, TimeData.class);

            System.out.println(td);
        }
*/
    }
}