package propsZESP;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

import exZESP.ExcepcionConfNoValida;


/**
 * Configurador de la utilidad desde un archivo de properties
 * @author santiago
 */
public class ConfZESP {
		
	private static final String apiURL = "https://www.zwiftpower.com/api3.php?do=";
//	String apiURL = "https://www.zwiftpower.com/api3.php?do=race_history&" + timestamp.getTime();
//	private static final String apiURL = "https://www.zwiftpower.com/api3.php?do=event_results&zid=208032&=1564783500";
	
	private static final String curtime = String.valueOf(Math.toIntExact(System.currentTimeMillis()/1000));
	private static final String race_his = apiURL + "race_history&" + curtime;
	private static String race_res = apiURL + "event_results&zid=";
	
	// Props relativas a eventos ZP
	private String zpEvId;        // Id del evento en ZP
	private String zpEvDate;      // Fecha del evento en ZP: "AAAA-MM-DD hh:mm:ss"
	private String zpEvTime;      // Timestamp correspondiente a la fecha del evento en ZP (en segundos)
	private String zpEvName;      // Nombre del evento en ZP
	
	// Props config log
	private String logcfg;        // Path completo del archivo log4j2.xml
	private String logpath;       // Path del directorio de log

	// Props csv
	private String[] header;      // Path completo del archivo log4j2.xml
	private String csvpath;       // Path del directorio de log

	/**
	 * Cargar archivo de properties
	 * @param pathProps path absoluto del archivo de configuración
	 */
	public ConfZESP(String pathProps) throws IOException, ExcepcionConfNoValida {
	    Properties props = new Properties();
	    FileInputStream fis = null;
	 
	    fis = new FileInputStream(pathProps);
	    props.load(fis);

	    this.logcfg =  props.getProperty("zpLogCfg");
	    this.logpath = props.getProperty("zpLogPath");

	    this.zpEvId = props.getProperty("zpEvId");
	    ConfZESP.race_res += this.zpEvId;
	    this.zpEvDate = props.getProperty("zpEvDate");
	    this.zpEvTime = String.valueOf(Math.toIntExact(Timestamp.valueOf(this.zpEvDate).getTime()/1000));
	    this.zpEvName = props.getProperty("zpEvName");

	    String saux =  props.getProperty("zpCsvHead");
	    this.header = saux.split(",");
	    for(int i=0; i<this.header.length; i++)
	    	this.header[i] = this.header[i].trim();
	    this.csvpath = props.getProperty("zpCsvPath");

		if(!test_conf())
			throw new ExcepcionConfNoValida("Parámetros incorrectos");

	}

	public static String getCurtime() {
		return curtime;
	}

	public String getZpEvId() {
		return zpEvId;
	}

	public String getZpEvDate() {
		return zpEvDate;
	}

	public String getZpEvTime() {
		return zpEvTime;
	}

	public String getZpEvName() {
		return zpEvName;
	}

	public static String getRaceHis() {
		return race_his;
	}

	public static String getRace_res() {
		return race_res;
	}

	public String getLogcfg() {
		return logcfg;
	}

	public String getLogpath() {
		return logpath;
	}

	public String[] getHeader() {
		return header;
	}

	public String getCsvpath() {
		return csvpath;
	}

	@Override
	public String toString() {
		return "ConfZESP [" + (zpEvId != null ? "zpEvId=" + zpEvId + ", " : "")
				+ (zpEvDate != null ? "zpEvDate=" + zpEvDate + ", " : "")
				+ (zpEvTime != null ? "zpEvTime=" + zpEvTime + ", " : "")
				+ (zpEvName != null ? "zpEvName=" + zpEvName + ", " : "")
				+ (logcfg != null ? "logcfg=" + logcfg + ", " : "")
				+ (logpath != null ? "logpath=" + logpath + ", " : "")
				+ (header != null ? "header=" + header + ", " : "")
				+ (csvpath != null ? "csvpath=" + csvpath + ", " : "")
				+ "\n\trace_res=" + race_res + ", \n\trace_his=" + race_his + "]";
	}

	/**
	 * Tester del archivo de conf .ini
	 * @param conf el cargador del .ini
	 * @return true si OK
	 */
	private boolean test_conf() {
		
		// Tienen que estar obligatoriamente definidas
		if(this.logpath == null || this.logcfg == null ||
				this.logpath.equals("") || this.logcfg.equals("") ||
				this.header == null || this.header[0] == null || this.header[0].equals("") ||
				this.csvpath == null || this.csvpath.equals(""))
			return false;
		
		return true;
	}
	
}
