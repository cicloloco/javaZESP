package jsonZESP;

import java.util.List;

public class ZP_Result {

	class TimeData {

	    private Double t1;
	    private int t2;

	    public TimeData(Double t1, int t2) {
			super();
			this.t1 = t1;
			this.t2 = t2;
		}

		@Override
	    public String toString() {
	        return "TimeData{" + "t1=" + t1 + ", t2=" + t2 + '}';
	    }
	}

	class HeighData {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "HeighData [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class AvgHr {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "AvgHr [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class MaxHr {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "DataHr [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class WeightData {

	    private double v1;
	    private int v2;

	    @Override
		public String toString() {
			return "Weight [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class NpData {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "NpData [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class StrData {

	    private String s;
	    private int v;

	    @Override
		public String toString() {
			return "StrData [s=" + s + ", v=" + v + "]";
		}
	}

	class AvgPower {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "AvgPower [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	class WFTPData {

	    private int v1;
	    private int v2;

	    @Override
		public String toString() {
			return "WFTP [v1=" + v1 + ", v2=" + v2 + "]";
		}
	}

	private String DT_RowId;
	private String ftp;
	private int friend;
	private String pt;
	private String label;
	private String zid;
	private int pos;
    private int position_in_cat;
    private String name;
    private int cp;
    private int act_id;
    private String act_name;
    private int zwid;
    private String res_id;
    private String aid;
    private int lag;
    private String uid;
//    private TimeData time;
    private List<String> time;
    private String zesp_time;
    private double time_gun;
    private double gap;
    private String vtta;
    private int male;
    private String tid;
    private String topen;
    private String tname;
    private String tc;
    private String tbc;
    private String tbd;
    private int zeff;
    private String category;
//    private HeighData height;
    private List<String> height;
    private String flag;
//    private AvgHr avg_hr;
    private List<String> avg_hr;
//    private MaxHr max_hr;
    private List<String> max_hr;
//    private MaxHr hrmax;
    private List<String> hrmax;
    private int hrm;
//    private WeightData weight;
    private List<String> weight;
    private int power_type;
    private int display_pos;
    private int src;
    private String age;
    private int zada;
    private String note;
    private int div;
    private int divw;
    private double skill;
    private double skill_b;
    private double skill_gain;
//    private NpData np;
    private List<String> np;
//    private StrData hrr;
    private List<String> hrr;
//    private StrData hreff;
    private List<String> hreff;
//    private AvgPower avg_power;
    private List<String> avg_power;
//    private StrData avg_wkg;
    private List<String> avg_wkg;
//    private StrData wkg_ftp;
    private List<String> wkg_ftp;
//    private WFTPData wftp;
    private List<String> wftp;
    private int wkg_guess;
//    private StrData wkg1200;
    private List<String> wkg1200;
//    private StrData wkg300;
    private List<String> wkg300;
//    private StrData wkg120;
    private List<String> wkg120;
//    private StrData wkg60;
    private List<String> wkg60;
//    private StrData wkg30;
    private List<String> wkg30;
//    private StrData wkg15;
    private List<String> wkg15;
//    private StrData wkg5;
    private List<String> wkg5;
//    private StrData w1200;
    private List<String> w1200;
//    private StrData w300;
    private List<String> w300;
//    private StrData w120;
    private List<String> w120;
//    private StrData w60;
    private List<String> w60;
//    private StrData w30;
    private List<String> w30;
//    private StrData w15;
    private List<String> w15;
//    private StrData w5;
    private List<String> w5;
    private int is_guess;
    private int upg;
    private String penalty;
    private int reg;
    private String fl;
    private String pts;
    private String pts_pos;
    private int info;
    private List<String> info_notes;
    private int log;
    private int lead;
    private int sweep;
    private int anal;


    public ZP_Result() {
		// TODO Auto-generated constructor stub
	}

	public ZP_Result(String dT_RowId, String ftp, int friend, String pt, String label, String zid, int pos,
			int position_in_cat, String name, int cp, int act_id, String act_name, int zwid, String res_id, String aid,
			int lag, String uid, List<String> time, String zesp_time, double time_gun, double gap, String vtta, int male,
			String tid, String topen, String tname, String tc, String tbc, String tbd, int zeff, String category,
			List<String> height, String flag, List<String> avg_hr, List<String> max_hr, List<String> hrmax, int hrm,
			List<String> weight, int power_type, int display_pos, int src, String age, int zada, String note, int div,
			int divw, double skill, double skill_b, double skill_gain, List<String> np, List<String> hrr,
			List<String> hreff, List<String> avg_power, List<String> avg_wkg, List<String> wkg_ftp, List<String> wftp,
			int wkg_guess, List<String> wkg1200, List<String> wkg300, List<String> wkg120, List<String> wkg60,
			List<String> wkg30, List<String> wkg15, List<String> wkg5, List<String> w1200, List<String> w300,
			List<String> w120, List<String> w60, List<String> w30, List<String> w15, List<String> w5, int is_guess,
			int upg, String penalty, int reg, String fl, String pts, String pts_pos, int info, List<String> info_notes,
			int log, int lead, int sweep, int anal) {
		super();
		DT_RowId = dT_RowId;
		this.ftp = ftp;
		this.friend = friend;
		this.pt = pt;
		this.label = label;
		this.zid = zid;
		this.pos = pos;
		this.position_in_cat = position_in_cat;
		this.name = name;
		this.cp = cp;
		this.act_id = act_id;
		this.act_name = act_name;
		this.zwid = zwid;
		this.res_id = res_id;
		this.aid = aid;
		this.lag = lag;
		this.uid = uid;
		this.time = time;
		this.zesp_time = zesp_time;
		this.time_gun = time_gun;
		this.gap = gap;
		this.vtta = vtta;
		this.male = male;
		this.tid = tid;
		this.topen = topen;
		this.tname = tname;
		this.tc = tc;
		this.tbc = tbc;
		this.tbd = tbd;
		this.zeff = zeff;
		this.category = category;
		this.height = height;
		this.flag = flag;
		this.avg_hr = avg_hr;
		this.max_hr = max_hr;
		this.hrmax = hrmax;
		this.hrm = hrm;
		this.weight = weight;
		this.power_type = power_type;
		this.display_pos = display_pos;
		this.src = src;
		this.age = age;
		this.zada = zada;
		this.note = note;
		this.div = div;
		this.divw = divw;
		this.skill = skill;
		this.skill_b = skill_b;
		this.skill_gain = skill_gain;
		this.np = np;
		this.hrr = hrr;
		this.hreff = hreff;
		this.avg_power = avg_power;
		this.avg_wkg = avg_wkg;
		this.wkg_ftp = wkg_ftp;
		this.wftp = wftp;
		this.wkg_guess = wkg_guess;
		this.wkg1200 = wkg1200;
		this.wkg300 = wkg300;
		this.wkg120 = wkg120;
		this.wkg60 = wkg60;
		this.wkg30 = wkg30;
		this.wkg15 = wkg15;
		this.wkg5 = wkg5;
		this.w1200 = w1200;
		this.w300 = w300;
		this.w120 = w120;
		this.w60 = w60;
		this.w30 = w30;
		this.w15 = w15;
		this.w5 = w5;
		this.is_guess = is_guess;
		this.upg = upg;
		this.penalty = penalty;
		this.reg = reg;
		this.fl = fl;
		this.pts = pts;
		this.pts_pos = pts_pos;
		this.info = info;
		this.info_notes = info_notes;
		this.log = log;
		this.lead = lead;
		this.sweep = sweep;
		this.anal = anal;
	}

	public String getDT_RowId() {
		return DT_RowId;
	}

	public void setDT_RowId(String dT_RowId) {
		DT_RowId = dT_RowId;
	}

	public String getFtp() {
		return ftp;
	}

	public void setFtp(String ftp) {
		this.ftp = ftp;
	}

	public int getFriend() {
		return friend;
	}

	public void setFriend(int friend) {
		this.friend = friend;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getZid() {
		return zid;
	}

	public void setZid(String zid) {
		this.zid = zid;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getPosition_in_cat() {
		return position_in_cat;
	}

	public void setPosition_in_cat(int position_in_cat) {
		this.position_in_cat = position_in_cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getAct_id() {
		return act_id;
	}

	public void setAct_id(int act_id) {
		this.act_id = act_id;
	}

	public String getAct_name() {
		return act_name;
	}

	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}

	public int getZwid() {
		return zwid;
	}

	public void setZwid(int zwid) {
		this.zwid = zwid;
	}

	public String getRes_id() {
		return res_id;
	}

	public void setRes_id(String res_id) {
		this.res_id = res_id;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public int getLag() {
		return lag;
	}

	public void setLag(int lag) {
		this.lag = lag;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	public String getZesp_time() {
		return zesp_time;
	}

	public void setZesp_time(String zesp_time) {
		this.zesp_time = zesp_time;
	}

	public double getTime_gun() {
		return time_gun;
	}

	public void setTime_gun(double time_gun) {
		this.time_gun = time_gun;
	}

	public double getGap() {
		return gap;
	}

	public void setGap(double gap) {
		this.gap = gap;
	}

	public String getVtta() {
		return vtta;
	}

	public void setVtta(String vtta) {
		this.vtta = vtta;
	}

	public int getMale() {
		return male;
	}

	public void setMale(int male) {
		this.male = male;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTopen() {
		return topen;
	}

	public void setTopen(String topen) {
		this.topen = topen;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getTbc() {
		return tbc;
	}

	public void setTbc(String tbc) {
		this.tbc = tbc;
	}

	public String getTbd() {
		return tbd;
	}

	public void setTbd(String tbd) {
		this.tbd = tbd;
	}

	public int getZeff() {
		return zeff;
	}

	public void setZeff(int zeff) {
		this.zeff = zeff;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getHeight() {
		return height;
	}

	public void setHeight(List<String> height) {
		this.height = height;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<String> getAvg_hr() {
		return avg_hr;
	}

	public void setAvg_hr(List<String> avg_hr) {
		this.avg_hr = avg_hr;
	}

	public List<String> getMax_hr() {
		return max_hr;
	}

	public void setMax_hr(List<String> max_hr) {
		this.max_hr = max_hr;
	}

	public List<String> getHrmax() {
		return hrmax;
	}

	public void setHrmax(List<String> hrmax) {
		this.hrmax = hrmax;
	}

	public int getHrm() {
		return hrm;
	}

	public void setHrm(int hrm) {
		this.hrm = hrm;
	}

	public List<String> getWeight() {
		return weight;
	}

	public void setWeight(List<String> weight) {
		this.weight = weight;
	}

	public int getPower_type() {
		return power_type;
	}

	public void setPower_type(int power_type) {
		this.power_type = power_type;
	}

	public int getDisplay_pos() {
		return display_pos;
	}

	public void setDisplay_pos(int display_pos) {
		this.display_pos = display_pos;
	}

	public int getSrc() {
		return src;
	}

	public void setSrc(int src) {
		this.src = src;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getZada() {
		return zada;
	}

	public void setZada(int zada) {
		this.zada = zada;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}

	public int getDivw() {
		return divw;
	}

	public void setDivw(int divw) {
		this.divw = divw;
	}

	public double getSkill() {
		return skill;
	}

	public void setSkill(double skill) {
		this.skill = skill;
	}

	public double getSkill_b() {
		return skill_b;
	}

	public void setSkill_b(double skill_b) {
		this.skill_b = skill_b;
	}

	public double getSkill_gain() {
		return skill_gain;
	}

	public void setSkill_gain(double skill_gain) {
		this.skill_gain = skill_gain;
	}

	public List<String> getNp() {
		return np;
	}

	public void setNp(List<String> np) {
		this.np = np;
	}

	public List<String> getHrr() {
		return hrr;
	}

	public void setHrr(List<String> hrr) {
		this.hrr = hrr;
	}

	public List<String> getHreff() {
		return hreff;
	}

	public void setHreff(List<String> hreff) {
		this.hreff = hreff;
	}

	public List<String> getAvg_power() {
		return avg_power;
	}

	public void setAvg_power(List<String> avg_power) {
		this.avg_power = avg_power;
	}

	public List<String> getAvg_wkg() {
		return avg_wkg;
	}

	public void setAvg_wkg(List<String> avg_wkg) {
		this.avg_wkg = avg_wkg;
	}

	public List<String> getWkg_ftp() {
		return wkg_ftp;
	}

	public void setWkg_ftp(List<String> wkg_ftp) {
		this.wkg_ftp = wkg_ftp;
	}

	public List<String> getWftp() {
		return wftp;
	}

	public void setWftp(List<String> wftp) {
		this.wftp = wftp;
	}

	public int getWkg_guess() {
		return wkg_guess;
	}

	public void setWkg_guess(int wkg_guess) {
		this.wkg_guess = wkg_guess;
	}

	public List<String> getWkg1200() {
		return wkg1200;
	}

	public void setWkg1200(List<String> wkg1200) {
		this.wkg1200 = wkg1200;
	}

	public List<String> getWkg300() {
		return wkg300;
	}

	public void setWkg300(List<String> wkg300) {
		this.wkg300 = wkg300;
	}

	public List<String> getWkg120() {
		return wkg120;
	}

	public void setWkg120(List<String> wkg120) {
		this.wkg120 = wkg120;
	}

	public List<String> getWkg60() {
		return wkg60;
	}

	public void setWkg60(List<String> wkg60) {
		this.wkg60 = wkg60;
	}

	public List<String> getWkg30() {
		return wkg30;
	}

	public void setWkg30(List<String> wkg30) {
		this.wkg30 = wkg30;
	}

	public List<String> getWkg15() {
		return wkg15;
	}

	public void setWkg15(List<String> wkg15) {
		this.wkg15 = wkg15;
	}

	public List<String> getWkg5() {
		return wkg5;
	}

	public void setWkg5(List<String> wkg5) {
		this.wkg5 = wkg5;
	}

	public List<String> getW1200() {
		return w1200;
	}

	public void setW1200(List<String> w1200) {
		this.w1200 = w1200;
	}

	public List<String> getW300() {
		return w300;
	}

	public void setW300(List<String> w300) {
		this.w300 = w300;
	}

	public List<String> getW120() {
		return w120;
	}

	public void setW120(List<String> w120) {
		this.w120 = w120;
	}

	public List<String> getW60() {
		return w60;
	}

	public void setW60(List<String> w60) {
		this.w60 = w60;
	}

	public List<String> getW30() {
		return w30;
	}

	public void setW30(List<String> w30) {
		this.w30 = w30;
	}

	public List<String> getW15() {
		return w15;
	}

	public void setW15(List<String> w15) {
		this.w15 = w15;
	}

	public List<String> getW5() {
		return w5;
	}

	public void setW5(List<String> w5) {
		this.w5 = w5;
	}

	public int getIs_guess() {
		return is_guess;
	}

	public void setIs_guess(int is_guess) {
		this.is_guess = is_guess;
	}

	public int getUpg() {
		return upg;
	}

	public void setUpg(int upg) {
		this.upg = upg;
	}

	public String getPenalty() {
		return penalty;
	}

	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public int getReg() {
		return reg;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
	}

	public String getPts() {
		return pts;
	}

	public void setPts(String pts) {
		this.pts = pts;
	}

	public String getPts_pos() {
		return pts_pos;
	}

	public void setPts_pos(String pts_pos) {
		this.pts_pos = pts_pos;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public List<String> getInfo_notes() {
		return info_notes;
	}

	public void setInfo_notes(List<String> info_notes) {
		this.info_notes = info_notes;
	}

	public int getLog() {
		return log;
	}

	public void setLog(int log) {
		this.log = log;
	}

	public int getLead() {
		return lead;
	}

	public void setLead(int lead) {
		this.lead = lead;
	}

	public int getSweep() {
		return sweep;
	}

	public void setSweep(int sweep) {
		this.sweep = sweep;
	}

	public int getAnal() {
		return anal;
	}

	public void setAnal(int anal) {
		this.anal = anal;
	}

	@Override
	public String toString() {
		return "ZP_Result [DT_RowId=" + DT_RowId + ", ftp=" + ftp + ", friend=" + friend + ", pt=" + pt + ", label="
				+ label + ", zid=" + zid + ", pos=" + pos + ", position_in_cat=" + position_in_cat + ", name=" + name
				+ ", cp=" + cp + ", act_id=" + act_id + ", act_name=" + act_name + ", zwid=" + zwid + ", res_id="
				+ res_id + ", aid=" + aid + ", lag=" + lag + ", uid=" + uid + ", time=" + time + ", zesp_time=" + zesp_time
				+ ", time_gun=" + time_gun + ", gap=" + gap + ", vtta=" + vtta + ", male=" + male + ", tid=" + tid + ", topen=" + topen
				+ ", tname=" + tname + ", tc=" + tc + ", tbc=" + tbc + ", tbd=" + tbd + ", zeff=" + zeff + ", category="
				+ category + ", height=" + height + ", flag=" + flag + ", avg_hr=" + avg_hr + ", max_hr=" + max_hr
				+ ", hrmax=" + hrmax + ", hrm=" + hrm + ", weight=" + weight + ", power_type=" + power_type
				+ ", display_pos=" + display_pos + ", src=" + src + ", age=" + age + ", zada=" + zada + ", note=" + note
				+ ", div=" + div + ", divw=" + divw + ", skill=" + skill + ", skill_b=" + skill_b + ", skill_gain="
				+ skill_gain + ", np=" + np + ", hrr=" + hrr + ", hreff=" + hreff + ", avg_power=" + avg_power
				+ ", avg_wkg=" + avg_wkg + ", wkg_ftp=" + wkg_ftp + ", wftp=" + wftp + ", wkg_guess=" + wkg_guess
				+ ", wkg1200=" + wkg1200 + ", wkg300=" + wkg300 + ", wkg120=" + wkg120 + ", wkg60=" + wkg60 + ", wkg30="
				+ wkg30 + ", wkg15=" + wkg15 + ", wkg5=" + wkg5 + ", w1200=" + w1200 + ", w300=" + w300 + ", w120="
				+ w120 + ", w60=" + w60 + ", w30=" + w30 + ", w15=" + w15 + ", w5=" + w5 + ", is_guess=" + is_guess
				+ ", upg=" + upg + ", penalty=" + penalty + ", reg=" + reg + ", fl=" + fl + ", pts=" + pts
				+ ", pts_pos=" + pts_pos + ", info=" + info + ", info_notes=" + info_notes + ", log=" + log + ", lead="
				+ lead + ", sweep=" + sweep + ", anal=" + anal + "]";
	}

}
