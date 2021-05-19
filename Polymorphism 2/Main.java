package payroll;

public class Main {

	public static void main(String[] args) {
		Payroll P = new Payroll();
		Admin A = new Admin();
		Academic D = new Academic();
		
		P.adjustSalary(50000);
		
		A.setName("ABC");
		A.setSalary(2000);
		A.adjustSalary(2000);
        A.doAdminStuff();
        
        D.setName("XYZ");
        D.setSalary(5000);
        D.adjustSalary(3000);
        D.giveLecture();
	}

}
