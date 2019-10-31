package jsonZESP;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


/**
 * Eventos ZP de tipo carrera TRace
 * @author santiago
 */
public class ZP_Races {
	
	private Reader reader;
	private TRace rtype;
	private String filtro;
	private ArrayList<ZP_Event> zp_races;

	/**
	 * @param r la fuente de datos
	 * @param rt el tipo de evento
	 * @param f el patrón a aplicar el nombre del evento
	 */
    public ZP_Races(Reader r, TRace rt, String f) {
		super();
		// TODO Auto-generated constructor stub
		zp_races = new ArrayList<ZP_Event>();
		this.reader = r;
		this.rtype = rt;     // Podrá ser run, road_race, ...
		this.filtro = f;
	}

    /**
     * Parsea resultados de ZP generando una lista de eventos que cumplen el patrón
     * @return nº de eventos encontrados
     * @throws IOException
     */
    public int getData() throws IOException {
        JsonElement data;
        JsonArray jsonArray;
        ZP_Event zpEvent;

        JsonElement jsonTree = JsonParser.parseReader(reader);
        Gson gson = new Gson();
        
        if(jsonTree.isJsonObject()) {
            JsonObject jsonObject = jsonTree.getAsJsonObject();
            data = jsonObject.get("data");
            if(data.isJsonArray()) {
                jsonArray = data.getAsJsonArray();
                Iterator<JsonElement> iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    zpEvent = gson.fromJson((JsonElement) iterator.next(), ZP_Event.class);
                    // rtype run | road_race
                    switch(this.rtype) {
                    case RoadRace:
                    case Run:
                    	if(race_filter(zpEvent.getRtype(), zpEvent.getT())) {
                        	this.zp_races.add(zpEvent);
                            System.out.println("Ev. #" + this.zp_races.size() + ": " + zpEvent.toString());
                    	}
                    	break;
                    default:
                    	// Houston tenemos un problema (tipo no contemplado)
                    }
                }                
            }
        }
        return this.zp_races.size();
    }
    
    /**
     * @param tRace: el tipo de evento
     * @param evName: el nombre del evento
     * @return true si el evento satisface el filtro
     */
    boolean race_filter(String tRace, String evName) {
    	final String REGEX = ".*" + this.filtro + ".*";
    	Pattern pattern = Pattern.compile(REGEX);
    	Matcher matcher = pattern.matcher(evName);
  	
    	return (tRace.equals(this.rtype.getTRace()) && matcher.matches());
    }
    
}