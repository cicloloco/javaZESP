package jsonZESP;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;


public class ZP_RaceResults {
	
	private Reader reader;
	private ArrayList<ZP_Result> zp_results;
	
	/**
	 * Constructor con id del evento explícita
	 * @param r fuente de datos
	 */
    public ZP_RaceResults(Reader r) {
		super();
		// TODO Auto-generated constructor stub
		zp_results = new ArrayList<ZP_Result>();
		this.reader = r;
	}
    
    public ArrayList<ZP_Result> getZp_results() {
		return zp_results;
	}

	public int getData() throws IOException {
        JsonElement data, aux;
        JsonArray jsonArray;
        ZP_Result zpRes;

        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(reader);
        
        if(jsonTree.isJsonObject()) {
            JsonObject jsonObject = jsonTree.getAsJsonObject();
            data = jsonObject.get("data");
            if(data.isJsonArray()) {
                jsonArray = data.getAsJsonArray();
                Iterator<JsonElement> iterator = jsonArray.iterator();
                while (iterator.hasNext()) {

                    zpRes = setResult((JsonObject) iterator.next());
                    this.zp_results.add(zpRes);

//                    if(zpRes.getZid().equals("208032")) {
              	  System.out.println("Res. #" + this.zp_results.size() + ": " + zpRes.toString());
                  if(zpRes.getZwid() == 1268845) {
                	  System.out.println("Aquí me paro");
                  }
                    
                }
                
            }
        }
        
        return this.zp_results.size();
    }
    
    
    private ZP_Result setResult(JsonObject jsonObject) {
        ZP_Result zpResult;
        JsonElement data;
        String strtime = "";
    	
        zpResult = new ZP_Result();
        
        data = jsonObject.get("DT_RowId");
        zpResult.setDT_RowId(data.getAsString());
        data = jsonObject.get("ftp");
        zpResult.setFtp(data.getAsString());
        data = jsonObject.get("friend");
        zpResult.setFriend(data.getAsInt());
        data = jsonObject.get("pt");
        zpResult.setPt(data.getAsString());
        data = jsonObject.get("label");
        zpResult.setLabel(data.getAsString());
        data = jsonObject.get("zid");
        zpResult.setZid(data.getAsString());
        data = jsonObject.get("pos");
        zpResult.setPos(data.getAsInt());
        data = jsonObject.get("position_in_cat");
        zpResult.setPosition_in_cat(data.getAsInt());
        data = jsonObject.get("name");
        zpResult.setName(data.getAsString());
        data = jsonObject.get("cp");
        zpResult.setCp(data.getAsInt());
        data = jsonObject.get("act_id");
        zpResult.setAct_id(data.getAsInt());
        data = jsonObject.get("act_name");
        zpResult.setAct_name(data.getAsString());
        data = jsonObject.get("zwid");
        zpResult.setZwid(data.getAsInt());
        data = jsonObject.get("res_id");
        zpResult.setRes_id(data.getAsString());
        data = jsonObject.get("aid");
        zpResult.setAid(data.getAsString());
        data = jsonObject.get("lag");
        zpResult.setLag(data.getAsInt());
        data = jsonObject.get("uid");
        zpResult.setUid(data.getAsString());
        data = jsonObject.get("time");
        zpResult.setTime(jsonConverter(data.getAsJsonArray()));
        
		strtime = tConverter(data.getAsJsonArray().get(0).getAsString());
        zpResult.setZesp_time(strtime);

        data = jsonObject.get("time_gun");
        zpResult.setTime_gun(data.getAsDouble());
        data = jsonObject.get("gap");
        zpResult.setGap(data.getAsInt());
        data = jsonObject.get("vtta");
        zpResult.setVtta(data.getAsString());
        data = jsonObject.get("male");
        zpResult.setMale(data.getAsInt());
        data = jsonObject.get("tid");
        zpResult.setTid(data.getAsString());
        data = jsonObject.get("topen");
        zpResult.setTopen(data.getAsString());
        data = jsonObject.get("tname");
        zpResult.setTname(data.getAsString());
        data = jsonObject.get("tc");
        zpResult.setTc(data.getAsString());
        data = jsonObject.get("tbc");
        zpResult.setTbc(data.getAsString());
        data = jsonObject.get("tbd");
        zpResult.setTbd(data.getAsString());
        data = jsonObject.get("zeff");
        zpResult.setZeff(data.getAsInt());
        data = jsonObject.get("category");
        zpResult.setCategory(data.getAsString());
        data = jsonObject.get("height");
        zpResult.setHeight(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("flag");
        zpResult.setFlag(data.getAsString());
        data = jsonObject.get("avg_hr");
        zpResult.setAvg_hr(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("max_hr");
        zpResult.setMax_hr(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("hrm");
        zpResult.setHrm(data.getAsInt());
        data = jsonObject.get("weight");
        zpResult.setWeight(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("power_type");
        zpResult.setPower_type(data.getAsInt());
        data = jsonObject.get("display_pos");
        zpResult.setDisplay_pos(data.getAsInt());
        data = jsonObject.get("src");
        zpResult.setSrc(data.getAsInt());
        data = jsonObject.get("age");
        zpResult.setAge(data.getAsString());
        data = jsonObject.get("zada");
        zpResult.setZada(data.getAsInt());
        data = jsonObject.get("note");
        zpResult.setNote(data.getAsString());
        data = jsonObject.get("div");
        zpResult.setDiv(data.getAsInt());
        data = jsonObject.get("divw");
        zpResult.setDivw(data.getAsInt());
        data = jsonObject.get("skill");
        zpResult.setSkill(data.getAsDouble());
        data = jsonObject.get("skill_b");
        zpResult.setSkill_b(data.getAsDouble());
        data = jsonObject.get("skill_gain");
        zpResult.setSkill_gain(data.getAsDouble());
        data = jsonObject.get("np");
        zpResult.setNp(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("hrr");
        zpResult.setHrr(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("hreff");
        zpResult.setHreff(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("avg_power");
        zpResult.setAvg_power(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("avg_wkg");
        zpResult.setAvg_wkg(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg_ftp");
        zpResult.setWkg_ftp(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wftp");
        zpResult.setWftp(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg_guess");
        zpResult.setWkg_guess(data.getAsInt());
        data = jsonObject.get("wkg1200");
        zpResult.setWkg1200(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg300");
        zpResult.setWkg300(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg120");
        zpResult.setWkg120(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg60");
        zpResult.setWkg60(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg30");
        zpResult.setWkg30(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg15");
        zpResult.setWkg15(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("wkg5");
        zpResult.setWkg5(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w1200");
        zpResult.setW1200(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w300");
        zpResult.setW300(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w120");
        zpResult.setW120(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w60");
        zpResult.setW60(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w30");
        zpResult.setW30(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w15");
        zpResult.setW15(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("w5");
        zpResult.setW5(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("is_guess");
        zpResult.setIs_guess(data.getAsInt());
        data = jsonObject.get("upg");
        zpResult.setUpg(data.getAsInt());
        data = jsonObject.get("penalty");
        zpResult.setPenalty(data.getAsString());
        data = jsonObject.get("reg");
        zpResult.setReg(data.getAsInt());
        data = jsonObject.get("fl");
        zpResult.setFl(data.getAsString());
        data = jsonObject.get("pts");
        zpResult.setPts(data.getAsString());
        data = jsonObject.get("pts_pos");
        zpResult.setPts_pos(data.getAsString());
        data = jsonObject.get("info");
        zpResult.setInfo(data.getAsInt());
        data = jsonObject.get("info_notes");
        zpResult.setInfo_notes(jsonConverter(data.getAsJsonArray()));
        data = jsonObject.get("log");
        zpResult.setLog(data.getAsInt());
        data = jsonObject.get("lead");
        zpResult.setLead(data.getAsInt());
        data = jsonObject.get("sweep");
        zpResult.setSweep(data.getAsInt());
        data = jsonObject.get("anal");
        zpResult.setAnal(data.getAsInt());

    	return zpResult;
    }
        
    private List<String> jsonConverter(JsonArray jsonArray) {
        Gson converter = new Gson();
       
        Type type = new TypeToken<List<String>>(){}.getType();
		return converter.fromJson(jsonArray, type );
    }
    
	private String tConverter(String str_time) {
        int horas = 0, minutos = 0, segundos = 0;
		String sparts[] = str_time.split("\\.");

		long sval = Long.valueOf(sparts[0]);
	    horas = (int) (sval / 3600);
	    minutos = (horas > 0 ? (int) (sval - 3600) / 60: (int) sval / 60);
	    //minutos = (int) (sval - 3600) / 60;
	    segundos = (minutos > 0 ? (int) (sval - 3600) % 60: (int) sval % 60);
	    //segundos = (int) (sval - 3600) % 60;

        return (String.format ("%02d", horas) + ":" + String.format ("%02d", minutos) + ":" + String.format ("%02d", segundos) + "." + sparts[1]);
    }
    
}