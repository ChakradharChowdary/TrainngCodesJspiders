package demopack.bl;

public class Clock {
 int hour;
 int min;
 int sec;
public Clock(int hour, int min, int sec) {
	super();
	this.hour = hour;
	this.min = min;
	this.sec = sec;
}
@Override
public String toString() {
	return "Hour :"+this.hour+"Min :"+this.min;
}
 public boolean equals(Object o1)
 {
	 Clock rv=(Clock)o1;
	 return (this.min==rv.min)&&(this.sec==rv.sec);
 }
}
