import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import csvZESP.ZespToCSV;
import jsonZESP.ZP_RaceResults;
import propsZESP.ConfZESP;


public class Test1_ZP_RaceResults {

	public Test1_ZP_RaceResults() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

//		ConfZESP tcz = new ConfZESP(args[0]);
		ConfZESP tcz = new ConfZESP("/home/santiago/MEGAsync/Ciclismo/ZESP/JavaZESP/JavaZESP.ini");
        ZP_RaceResults zpdata;
        ZespToCSV genCSV;

		System.out.println(tcz);
    	
//    	String apiURL = "https://www.zwiftpower.com/api3.php?do=event_results&zid=208032&=1564783500";
    	InputStream is = new URL(tcz.getRace_res()+"&=1564783500").openStream();
    	Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

    	zpdata = new ZP_RaceResults(reader);
    	int ne = zpdata.getData();
        System.out.println("Procesados " + ne + " eventos");

        genCSV = new ZespToCSV("/home/santiago/tmp/zpres.csv", zpdata.getZp_results());
        String[] zpcols = new String[] { "pos", "zwid", "name", "time", "zesp_time" };
        genCSV.convert(zpcols);
        
    }
}
