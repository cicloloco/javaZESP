import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import java.sql.Timestamp;

import jsonZESP.TRace;
import jsonZESP.ZP_Races;


public class Test_ZP_Races {

	public Test_ZP_Races() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

        ZP_Races zpdata;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	//Prefijo de la URL de zwiftpower
    	String apiURL = "https://www.zwiftpower.com/api3.php?do=race_history&" + timestamp.getTime();
    	
    	InputStream is = new URL(apiURL).openStream();
    	Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

    	zpdata = new ZP_Races(reader, TRace.RoadRace, "VZT Tofu Tornado");
    	int ne = zpdata.getData();
        System.out.println("Procesados " + ne + " eventos");

    }
}
