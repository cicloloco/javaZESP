import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import csvZESP.ZespToCSV;
import jsonZESP.ZP_RaceResults;


public class Test0_ZP_RaceResults {

	public Test0_ZP_RaceResults() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

        ZP_RaceResults zpdata;
        ZespToCSV genCSV;

    	//Prefijo de la URL de zwiftpower
//    	String apiURL = "https://www.zwiftpower.com/api3.php?do=event_results&zid=208032&=1564783500";
    	String apiURL = "https://www.zwiftpower.com/api3.php?do=event_results&zid=208032";
    	
    	InputStream is = new URL(apiURL).openStream();
    	Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

    	zpdata = new ZP_RaceResults(reader);
    	int ne = zpdata.getData();
        System.out.println("Procesados " + ne + " eventos");

        genCSV = new ZespToCSV("/home/santiago/tmp/zpres.csv", zpdata.getZp_results());
        String[] zpcols = new String[] { "pos", "zwid", "name", "time" };
        genCSV.convert(zpcols);
        
    }
}
