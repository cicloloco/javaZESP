package logZESP;

import java.io.File;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.status.StatusLogger;
 
/*
OFF 	0
FATAL 	100
ERROR 	200
WARN 	300
INFO 	400
DEBUG 	500
TRACE 	600
ALL	
*/	

public class LogZESP {

	private Logger zpLOG;
	
	/**
	 * Constructor logger
	 * @param dirlog (no null) el directorio o carpeta para los archivos de log
	 * @param logconf (no null) el path absoluto del fichero log4j2.xml
	 */
	public LogZESP(String dirlog, String logconf) {
    	System.setProperty("logPath", dirlog);
    	StatusLogger.getLogger().setLevel(Level.OFF); // Dehabilitar config por omisión
    	LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
    	File file = new File(logconf);
    	// this will force a reconfiguration
    	((org.apache.logging.log4j.core.LoggerContext) context).setConfigLocation(file.toURI());
        zpLOG = LogManager.getLogger(LogZESP.class);
	}
    
	/**
	 * Log writer
	 * @param ll el nivel de log
	 * @param msg el mensaje complementario
	 */
	public void write(Level ll, String msg) {
		if(ll == Level.FATAL)
	        zpLOG.fatal(msg);
		if(ll == Level.ERROR)
	        zpLOG.error(msg);
		if(ll == Level.WARN)
	        zpLOG.warn(msg);
		if(ll == Level.INFO)
	        zpLOG.info(msg);
		if(ll == Level.DEBUG)
	        zpLOG.debug(msg);
		if(ll == Level.TRACE)
	        zpLOG.trace(msg);
	}

	public Logger getZpLOG() {
		return zpLOG;
	}

}
