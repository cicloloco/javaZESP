package propsZESP;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;


public class ConfZESP {
	
	private static final String apiURL = "https://www.zwiftpower.com/api3.php?do=";
//	String apiURL = "https://www.zwiftpower.com/api3.php?do=race_history&" + timestamp.getTime();
//	private static final String apiURL = "https://www.zwiftpower.com/api3.php?do=event_results&zid=208032&=1564783500";
	
	private static final String curtime = String.valueOf(Math.toIntExact(System.currentTimeMillis()/1000));
	private static final String race_his = apiURL + "race_history&" + curtime;
	private static String race_res = apiURL + "event_results&zid=";
	
	private String zpEvId;        // Id del evento en ZP
	private String zpEvDate;      // Fecha del evento en ZP: "AAAA-MM-DD hh:mm:ss"
	private String zpEvTime;      // Timestamp correspondiente a la fecha del evento en ZP (en segundos)
	private String zpEvName;      // Nombre del evento en ZP

	public ConfZESP(String pathProps) {
		// TODO Auto-generated constructor stub
	    Properties props = new Properties();
	    FileInputStream fis = null;
	 
	    try {      				  // load properties
	    	fis = new FileInputStream(pathProps);
	    	props.load(fis);
	    	this.zpEvId = props.getProperty("zpEvId");
	    	ConfZESP.race_res += this.zpEvId;
	    	this.zpEvDate = props.getProperty("zpEvDate");
	    	this.zpEvTime = String.valueOf(Math.toIntExact(Timestamp.valueOf(this.zpEvDate).getTime()/1000));
	    	this.zpEvName = props.getProperty("zpEvName");
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
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

	@Override
	public String toString() {
		return "ConfZESP [" + (zpEvId != null ? "zpEvId=" + zpEvId + ", " : "")
				+ (zpEvDate != null ? "zpEvDate=" + zpEvDate + ", " : "")
				+ (zpEvTime != null ? "zpEvTime=" + zpEvTime + ", " : "")
				+ (zpEvName != null ? "zpEvName=" + zpEvName + ", " : "")
				+ "\n\trace_res=" + race_res + ", \n\trace_his=" + race_his + "]";
	}

}
