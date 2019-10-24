package jsonZESP;

public enum TRace {
	RoadRace("road_race", 0), Run("run", 1);

	private final String rtype;
	private final int id;

	private TRace(String rtype, int id) {
		this.rtype = rtype;
		this.id = id;
	}

	public String getTRace() {
		return rtype;
	}

}
