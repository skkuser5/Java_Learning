package test;

public class Employee {
	
	// state
	private int empNo=1234;
	public String empName="Robert Burt";
	String orgName = "xyz";
	protected String orgCountry="India";
	static String  OrgType="Business";
	
	// behavior
	public void printEmpName()
	{
		System.out.println("empName is "+ empName);
	}
	
	public int getEmpNo()
	{
		
		int value=0;
		return empNo;
	}

	
	protected String getOrgCountry() {
		
		System.out.println("In getorg country");
		return "India";
		
	}
}
