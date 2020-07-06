package employeeapplication;

public class Main
{
	private static void workWithData()
	{
		System.out.println("Welcome to Lambda School's Java!!");

		Healthplan h1 = new Healthplan("My Health 1");
		Healthplan h2 = new Healthplan("My Health 2");

		Company c1 = new Company("Company A", 100);
		Company c2 = new Company("Company B", 100);

		// public Employee(int id,
		// String fname, 
		// String lname, 
		// double salary, 
		// boolean has401K,
		// int companyId, 
		// int healthPlanId)

		Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
		Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
		Employee emp3 = new Employee("John", "Jones", 80000, false, c1.id, h1.getId());

		System.out.println(c1.toString());

		emp1.setSalary(emp1.getSalary() + 500);

		System.out.println(emp1.getFname()+" "+emp1.getSalary());

		System.out.println(c1.debt / 7);
		System.out.println(c1.debt % 7);
		System.out.println(c1.debt / 7.0);

		double result = (double) c1.debt / 14;
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}