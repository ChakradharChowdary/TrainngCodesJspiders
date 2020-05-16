package com.encapsulation.bl;

public class Emp {
	private int id;
	public Emp(int id)
	{
		if(id>=100 && id<=999 )
		{
			this.id=id;
		}
		else
		{
			System.out.println("invaild id");
		}
	}
public void displayId()
{
	System.out.println(this.id);
}
}
