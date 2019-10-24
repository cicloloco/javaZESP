package pruebas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestTimeStamp {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	public TestTimeStamp() {
		// TODO Auto-generated constructor stub
	}

    public static void main(String[] args) {

    	System.out.println(System.currentTimeMillis());
    	System.out.println(String.valueOf(Math.toIntExact(System.currentTimeMillis()/1000)));
    	long currentDateTime = 1565105400000L;
    	System.out.println(currentDateTime);
        //method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        //method 2 - via Date
        Date date = new Date(1565105400000L);
        System.out.println(new Timestamp(date.getTime()));

        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(timestamp.getTime());

        //format timestamp
        System.out.println(sdf.format(timestamp));
        
        timestamp = Timestamp.valueOf("2019-08-06 17:30:0");
        System.out.println(timestamp.getTime());
        System.out.println(sdf.format(timestamp));
        
        Locale spanish = new Locale("es", "ES");
        System.out.println(NumberFormat.getNumberInstance(spanish).format(5254.58));
        
        NumberFormat format = NumberFormat.getNumberInstance(spanish);
        long number;
        int horas = 0, minutos = 0, segundos = 0;

			String s1 = "5254.58";
			String sparts[] = s1.split("\\.");
	
			long sval = Long.valueOf(sparts[0]);
	        horas = (int) (sval / 3600);
	        minutos = (horas > 0 ? (int) (sval - 3600) / 60: (int) sval / 60);
	        //minutos = (int) (sval - 3600) / 60;
	        segundos = (minutos > 0 ? (int) (sval - 3600) % 60: (int) sval % 60);
	        //segundos = (int) (sval - 3600) % 60;
			System.out.println(String.format ("%02d", horas) + ":" + String.format ("%02d", minutos) + ":" + String.format ("%02d", segundos) + "." + sparts[1]);

    }
}

/*
Ev. #4062: ZP_Event [DT_RowId=210559, friends=0, tent=0, f_list=[], km=29862, tm=1565105400, r=17, t=VZT Tofu Tornado, zid=210559, rid=VZT, spi=, spl=, f=0, zcl=0, rt=3701568815, layout=44, layout_w=, rk=1, laps=1, cats=A,B,C,D, signups=, w=1, dur=0, dir=0, f_t=TYPE_RACE , f_km=KM_30, f_time=, f_day=, f_w=WORLD_WATOPIA, f_ru=R_2, f_r=ROUTE_HILLY, rtype=road_race, eid=0, rules=64, crules=1, cul=4, fin=20, ctype=1, tags=, recur=]
https://zwiftpower.com/events.php?zid=210559
Ev. #4063: ZP_Event [DT_RowId=209054, friends=0, tent=0, f_list=[], km=35720, tm=1565103900, r=23, t=3R WATOPIA-Volcano Circuit Flat Race - 8 Laps (35.2km/21.9mi 160m), zid=209054, rid=3R, spi=, spl=, f=0, zcl=0, rt=686828068, layout=, layout_w=, rk=1, laps=8, cats=A,B,C,D, signups=, w=1, dur=0, dir=0, f_t=TYPE_RACE , f_km=KM_60, f_time=, f_day=, f_w=WORLD_WATOPIA, f_ru=R_1, f_r=ROUTE_FLAT, rtype=road_race, eid=0, rules=65, crules=0, cul=3, fin=30, ctype=1, tags=, recur=]
*/