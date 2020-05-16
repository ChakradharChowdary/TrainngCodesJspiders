package demopack.ul;

import demopack.bl.Clock;

public class ClockTower {
public static void main(String[] args) {
	Clock c1=new Clock(7,12,45);
	Clock c2=new Clock(4,12,45);
	System.out.println(c1);
	System.out.println(c2);
	boolean status=c1.equals(c2);
	System.out.println(status);
}
}
