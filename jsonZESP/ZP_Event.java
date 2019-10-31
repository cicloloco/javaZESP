package jsonZESP;

import java.util.Arrays;

/**
 * Mapeo de eventos en ZwiftPower
 * @author santiago
 */
public class ZP_Event {

	/**
	 * Los campos corresponden literalmente a lo que devuelve como JSON
	 * Si cambian, lógicamente, requiere cambiar este mapero
	 */
	private String DT_RowId;
	private int friends;
	private int tent;
	private String[] f_list;
	private String[] ten_list;
	private String km;
	private long tm;
	private String r;
	private String t;
	private String zid;
	private String rid;
	private String spi;
	private String spl;
	private int f;
	private int zcl;
	private String rt;
	private String layout;
	private String layout_w;
	private int rk;
	private String laps;
	private String cats;
	private String signups;
	private String w;
	private String dur;
	private String dir;
	private String f_t;
	private String f_km;
	private String f_time;
	private String f_day;
	private String f_w;
	private String f_ru;
	private String f_r;
	private String rtype;
	private int eid;
	private String rules;
	private String crules;
	private String cul;
	private String fin;
	private int ctype;
	private String tags;
	private String recur;

	public ZP_Event() {
		// TODO Auto-generated constructor stub
	}

	public String getDT_RowId() {
		return DT_RowId;
	}

	public void setDT_RowId(String dT_RowId) {
		DT_RowId = dT_RowId;
	}

	public int getFriends() {
		return friends;
	}

	public void setFriends(int friends) {
		this.friends = friends;
	}

	public int getTent() {
		return tent;
	}

	public void setTent(int tent) {
		this.tent = tent;
	}

	public String[] getF_list() {
		return f_list;
	}

	public void setF_list(String[] f_list) {
		this.f_list = f_list;
	}

	public String[] getTen_list() {
		return ten_list;
	}

	public void setTen_list(String[] ten_list) {
		this.ten_list = ten_list;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public long getTm() {
		return tm;
	}

	public void setTm(int tm) {
		this.tm = tm;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getSpi() {
		return spi;
	}

	public void setSpi(String spi) {
		this.spi = spi;
	}

	public String getSpl() {
		return spl;
	}

	public void setSpl(String spl) {
		this.spl = spl;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int getZcl() {
		return zcl;
	}

	public void setZcl(int zcl) {
		this.zcl = zcl;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getLayout_w() {
		return layout_w;
	}

	public void setLayout_w(String layout_w) {
		this.layout_w = layout_w;
	}

	public int getRk() {
		return rk;
	}

	public void setRk(int rk) {
		this.rk = rk;
	}

	public String getLaps() {
		return laps;
	}

	public void setLaps(String laps) {
		this.laps = laps;
	}

	public String getCats() {
		return cats;
	}

	public void setCats(String cats) {
		this.cats = cats;
	}

	public String getSignups() {
		return signups;
	}

	public void setSignups(String signups) {
		this.signups = signups;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}

	public String getDur() {
		return dur;
	}

	public void setDur(String dur) {
		this.dur = dur;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getF_t() {
		return f_t;
	}

	public void setF_t(String f_t) {
		this.f_t = f_t;
	}

	public String getF_km() {
		return f_km;
	}

	public void setF_km(String f_km) {
		this.f_km = f_km;
	}

	public String getF_time() {
		return f_time;
	}

	public void setF_time(String f_time) {
		this.f_time = f_time;
	}

	public String getF_day() {
		return f_day;
	}

	public void setF_day(String f_day) {
		this.f_day = f_day;
	}

	public String getF_w() {
		return f_w;
	}

	public void setF_w(String f_w) {
		this.f_w = f_w;
	}

	public String getF_ru() {
		return f_ru;
	}

	public void setF_ru(String f_ru) {
		this.f_ru = f_ru;
	}

	public String getF_r() {
		return f_r;
	}

	public void setF_r(String f_r) {
		this.f_r = f_r;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getCrules() {
		return crules;
	}

	public void setCrules(String crules) {
		this.crules = crules;
	}

	public String getCul() {
		return cul;
	}

	public void setCul(String cul) {
		this.cul = cul;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public int getCtype() {
		return ctype;
	}

	public void setCtype(int ctype) {
		this.ctype = ctype;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRecur() {
		return recur;
	}

	public void setRecur(String recur) {
		this.recur = recur;
	}

    public String getZid() {
		return zid;
	}

	public void setZid(String zid) {
		this.zid = zid;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
/*
	@Override
    public String toString() {
        return "zpEvent{" + "DT_RowId=" + this.DT_RowId + ", t="
                + this.t + ", tm=" + this.tm + ", zid=" + this.zid + ", rtype=" + this.rtype + '}';
    }
*/

	@Override
	public String toString() {
		return "ZP_Event [" + (DT_RowId != null ? "DT_RowId=" + DT_RowId + ", " : "") + "friends=" + friends + ", tent="
				+ tent + ", " + (f_list != null ? "f_list=" + Arrays.toString(f_list) + ", " : "")
				+ (ten_list != null ? "ten_list=" + Arrays.toString(ten_list) + ", " : "")
				+ (km != null ? "km=" + km + ", " : "") + "tm=" + String.valueOf(tm) + ", " + (r != null ? "r=" + r + ", " : "")
				+ (t != null ? "t=" + t + ", " : "") + (zid != null ? "zid=" + zid + ", " : "")
				+ (rid != null ? "rid=" + rid + ", " : "") + (spi != null ? "spi=" + spi + ", " : "")
				+ (spl != null ? "spl=" + spl + ", " : "") + "f=" + f + ", zcl=" + zcl + ", "
				+ (rt != null ? "rt=" + rt + ", " : "") + (layout != null ? "layout=" + layout + ", " : "")
				+ (layout_w != null ? "layout_w=" + layout_w + ", " : "") + "rk=" + rk + ", "
				+ (laps != null ? "laps=" + laps + ", " : "") + (cats != null ? "cats=" + cats + ", " : "")
				+ (signups != null ? "signups=" + signups + ", " : "") + (w != null ? "w=" + w + ", " : "")
				+ (dur != null ? "dur=" + dur + ", " : "") + (dir != null ? "dir=" + dir + ", " : "")
				+ (f_t != null ? "f_t=" + f_t + ", " : "") + (f_km != null ? "f_km=" + f_km + ", " : "")
				+ (f_time != null ? "f_time=" + f_time + ", " : "") + (f_day != null ? "f_day=" + f_day + ", " : "")
				+ (f_w != null ? "f_w=" + f_w + ", " : "") + (f_ru != null ? "f_ru=" + f_ru + ", " : "")
				+ (f_r != null ? "f_r=" + f_r + ", " : "") + (rtype != null ? "rtype=" + rtype + ", " : "") + "eid="
				+ eid + ", " + (rules != null ? "rules=" + rules + ", " : "")
				+ (crules != null ? "crules=" + crules + ", " : "") + (cul != null ? "cul=" + cul + ", " : "")
				+ (fin != null ? "fin=" + fin + ", " : "") + "ctype=" + ctype + ", "
				+ (tags != null ? "tags=" + tags + ", " : "") + (recur != null ? "recur=" + recur : "") + "]";
	}
}
