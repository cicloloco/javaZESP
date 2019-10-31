import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import exZESP.ExcepcionConfNoValida;
import jsonZESP.ZP_RaceResults;
import logZESP.LogZESP;
import propsZESP.ConfZESP;

public class ZESPtool {

	public ZESPtool() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ConfZESP conf = null;
		LogZESP logger = null;
    	InputStream is = null;
        ZP_RaceResults zpdata;

		try {
			
			// Leer .ini desde la línea de orden
			if (args[0] == null || args[0].equals("") || args[0].length() != 1) {
				System.out.println("Indicar path fichero de configuración .ini");
				System.exit(-1);
			}
			
			conf = new ConfZESP(args[0]);
			
			// Arrancar logger conforme a la configuración desde .ini
			logger = new LogZESP(conf.getLogpath(), conf.getLogcfg());
			
			// Configurar la fuente y establecer conexión
			is = new URL(ConfZESP.getRace_res()).openStream();
			Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

	    	zpdata = new ZP_RaceResults(reader, logger);
	    	int ne = zpdata.getData();
	        System.out.println("Procesados " + ne + " eventos");
	        
	        // Volcar resultados a csv
	        zpdata.dumpData(conf.getCsvpath(), conf.getHeader());

		} catch (IOException e) {
			StringWriter sw = new StringWriter(); 			  
            PrintWriter pw = new PrintWriter(sw); 
            e.printStackTrace(pw); 
            System.out.println("## ERROR FATAL ##\tprintStackTrace():\n" + sw.toString());
		} catch (ExcepcionConfNoValida e) {
			StringWriter sw = new StringWriter(); 			  
            PrintWriter pw = new PrintWriter(sw); 
            e.printStackTrace(pw); 
            System.out.println("## ERROR FATAL ##\tprintStackTrace():\n" + sw.toString());
		}
	}

}
