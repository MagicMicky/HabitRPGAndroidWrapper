package com.magicmicky.habitrpgwrapper.lib.models.tasks;


/**
 * A daily item. It contains the item called "Daily" on the website
 * @author MagicMicky
 */
public class Daily extends HabitItem{
	private final static HabitType type=HabitType.daily;
	private boolean completed;
	private Days repeat;
	//TODO: private String lastCompleted;
	private int streak;
	/**
	 * Construct a daily based on all the information needed
	 * @param id the id of the daily
	 * @param notes the notes associated to a daily
	 * @param priority the priority of the daily
	 * @param text the text of the daily
	 * @param value the value (points) of the daily
	 * @param completed whether or not the daily is completed
	 * @param repeat when does it repeat?
	 */
	public Daily(String id, String notes, Integer priority, String text,
			double value, boolean completed, Days repeat) {
		super(id, notes, priority, text, value);
		this.setCompleted(completed);
		this.setRepeat(repeat);
	}
	public Daily(String id, String notes, Integer priority, String text,
			double value, boolean completed, Days repeat, String lastCompleted) {
		this(id, notes, priority, text, value,completed,repeat);
		//this.setLastCompleted(lastCompleted);
	}
	public Daily(String id, String notes, Integer priority, String text,
			double value, boolean completed, Days repeat, int streak, String lastCompleted) {
		this(id, notes, priority, text, value,completed,repeat,lastCompleted);
		this.setStreak(streak);
	}
	public Daily() {
		super();
		this.setCompleted(false);
		this.setRepeat(new Days());
	}
	/**
	 * @return if the daily is completed
	 */
	public boolean isCompleted() {
		return completed;
	}
	/**
	 *  Set whether or not the daily is completed
	 * @param completed
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	/**
	 * @return the repeat array.<br/>
	 * This array contains 7 values, one for each days, starting from monday.
	 */
	public Days getRepeat() {
		return repeat;
	}
	/**
	 * @param repeat the repeat array to set
	 */
	public void setRepeat(Days repeat) {
		this.repeat = repeat;
	}
	@Override
	protected String getType() {
		return type.toString();
	}
	@Override
	public String getJSONString() {
		StringBuilder json = new StringBuilder()
		.append("{")
			.append(super.getJSONBaseString());
			if(this.getRepeat() != null) {
				json.append("\"repeat\":{");
				for(int i=0;i<7;i++) {
				//TODO:	json.append("\"").append(Daily.days[i]).append("\": ").append(this.getRepeat()[i]).append(",");
				}
				json =json.deleteCharAt(json.length()-1);
				json.append("},");
			}
			json.append("\"streak\":").append(this.getStreak()).append(",");
			json.append("\"completed\":" + (this.isCompleted() ? "true":"false"))
		.append("}");
		return json.toString();
	}
	/**
	 * Formated: 
	 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	 * @return the lastCompleted
	 */
/*	public String getLastCompleted() {
		return lastCompleted;
	}
	/**
	 * @param lastCompleted the lastCompleted to set
	 */
/*	public void setLastCompleted(String lastCompleted) {
		this.lastCompleted = lastCompleted;
	}
	/**
	 * @return the streak
	 */
	public int getStreak() {
		return streak;
	}
	/**
	 * @param streak the streak to set
	 */
	public void setStreak(int streak) {
		this.streak = streak;
	}

    private class Days {
        private boolean m, t,w, th,f,s,su;
        private Days() {
            this.m=false;
            this.t=false;
            this.w=false;
            this.th=false;
            this.f=false;
            this.s=true;
            this.su=true;
        }

        public boolean isT() {
            return t;
        }

        public void setT(boolean t) {
            this.t = t;
        }

        public boolean isW() {
            return w;
        }

        public void setW(boolean w) {
            this.w = w;
        }

        public boolean isTh() {
            return th;
        }

        public void setTh(boolean th) {
            this.th = th;
        }

        public boolean isF() {
            return f;
        }

        public void setF(boolean f) {
            this.f = f;
        }

        public boolean isS() {
            return s;
        }

        public void setS(boolean s) {
            this.s = s;
        }

        public boolean isSu() {
            return su;
        }

        public void setSu(boolean su) {
            this.su = su;
        }

        public boolean isM() {
            return m;
        }

        public void setM(boolean m) {
            this.m = m;
        }
    }
}