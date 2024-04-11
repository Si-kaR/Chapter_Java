
public class Clock {
	private Counter hour;
	private Counter minute;
	private Counter second;

	// constants to represent the valid limits
	// for the clock's hours, minutes and seconds
	public static final int HOURS_PER_DAY = 24;
	public static final int MINS_PER_HOUR = 60;
	public static final int SECS_PER_MIN = 60;

	// default constructor
	public Clock(){
		hour = new Counter(HOURS_PER_DAY);
		minute = new Counter(MINS_PER_HOUR);
		second = new Counter(SECS_PER_MIN);
	}

	// constructor that sets the hour, minute and second
	// to specific values (within proper limits)
	public Clock(int h, int m, int s){
		if (h >= HOURS_PER_DAY ||
			m >= MINS_PER_HOUR ||
			s >= SECS_PER_MIN){
			String msg = String.format("Time %02d:%02d:%02d is invalid.",
										h, m, s);
			throw new RuntimeException(msg);
		}

		hour = new Counter(HOURS_PER_DAY, h);
		minute = new Counter(MINS_PER_HOUR, m);
		second = new Counter(SECS_PER_MIN, s);
	}

	// constructor that sets the hour and minute
	// values to specified values, and second to 0
	public Clock(int h, int m){
		this(h,m,0); // call the 3-parameter constructor
	}

	// constructor that sets the hour to a specified 
// values, and minute and second to 0
	public Clock(int h){
		this(h,0,0); // call the 3-parameter constructor
	}

	// A method that simulates the ticking of the
	// clock.  It returns true if the clock rolls
	// over (i.e. goes from 23:59:59 to 00:00:00)
	// and returns false otherwise.
	public boolean tick(){
		boolean rollOver = false;
		// increment the second hand and if it
		// rolls over, then increment the minute
		// as well, and if that also rolls over,
		// then increment hour.  If hour rolls over,
		// give that feedback to the caller by 
		// returning true
		if (second.increment()){
			if (minute.increment()){
				rollOver = hour.increment();
			}
		}
		return rollOver;
	}

	// Returns a nicely formatted string showing
	// the current time.
	public String toString(){
		return (hour + ":" + minute + ":" + second);
	}
}

// A helper class to represent the individual
// components of the clock.  A counter simply holds
// an integer value which can be increment,
// and which rolls over back to 0 when it hits a
// given limit.
class Counter {
	private int limit;
	private int value;

	// A constructor that sets the limit but 
	// initializes the value to 0.
	Counter(int limit){
		this(limit, 0); // call the 2-parameter constructor
	}

	// A constructor that creates a counter with
	// a given limit and current value.
	Counter(int limit, int value){
		this.limit = limit;
		this.value = value;
	}

	// increment the counter, returning true if
	// it hits the limit and needs to roll over
	boolean increment(){
		value = (++value)%limit;
		return (value == 0);
	}

	// get the current value of the counter
	int getValue(){
		return value;
	}

	// return a nicely formatted string holding
	// the current value of the counter
	public String toString(){
		return String.format("%02d",value);
	}
}