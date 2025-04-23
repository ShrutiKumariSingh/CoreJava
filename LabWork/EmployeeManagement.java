class EmployeeManagement
{
	public static void main(String args[])
	{
		
		
		Manager m=new Manager(200000,"Mrinal Das","M123","Accounts");
		m.displayDetails();
	}
}
class employee
{
	int salary;
	String name, employee_ID;
	employee(int sal, String n, String eid)
	{
		this.salary=sal;
		this.name=n;
		this.employee_ID=eid;
	}
	void displayDetails()
	{
		System.out.println("Salary:" + salary);
		System.out.println("Name:" + name);
		System.out.println("Employee Id:" + employee_ID);
	}
}
class Manager extends employee
{
	String departmentName;
	Manager(int sal, String n, String eid, String depname)
	{
		super(sal,n,eid);
		this.departmentName=depname;
	}
	void displayDetails()
	{
		 super.displayDetails();
		 System.out.print("Department Name:" + departmentName);
	}
}
