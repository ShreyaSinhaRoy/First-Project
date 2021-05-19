package payroll;

public class Admin extends Payroll  {
             String name;
             double salary;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getSalary() {
				return salary;
			}
			public void setSalary(double salary) {
				this.salary = salary;
			}
             public void doAdminStuff () {
            	 System.out.println("Admin stuff done.");
             }
             public void adjustSalary(int salary)
             {
            	 System.out.println("Adjusted salary of " + getName() + " is " + salary );
             }
             
}
