package hello;

import java.util.Calendar;

public class Schedule {

	public Schedule(long id, String phase, Calendar startCal, Calendar endCal) {
		this.id = id;
		this.phase = phase;
		this.startCal = startCal;
		this.endCal = endCal;
	}


	private final long id;

	private final String phase;

	private final Calendar startCal;

	private final Calendar endCal;

	public long getId() {
		return id;
	}

	public String getPhase() {
		return phase;
	}

	public Calendar getStartCal() {
		return startCal;
	}

	public Calendar getEndCal() {
		return endCal;
	}
}
