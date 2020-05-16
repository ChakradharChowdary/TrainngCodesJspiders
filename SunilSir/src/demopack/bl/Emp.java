package demopack.bl;

public class Emp
{
  private int empId;
 private String empName;
 private double empSal;
public Emp(int empId, String empName, double empSal) 
{
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}
@Override
public String toString() 
{
	return "--------------------------------\n"+
		 "Emp id ---->"+this.empId+
		 "\nEmp name ---->"+this.empName+
		 "\nEmp sal ---->"+this.empSal+
		 "\n---------------------------------";
}
public boolean equals(Object o1)
{
	Emp rv=(Emp)o1;
	return (this.empSal==rv.empSal);
}
}
