package inheritance;

class Person {
	 private String name;
	 private String address;
	
	 public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Person [name = "+ getName() + ", address = " +getAddress() + "]";
	}
}
class Student extends  Person {
	private String program;
	private int year;
	private double fee;
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString () {
		return "Student [name = "+ getName() + ", address = " +getAddress() + ", program = " + getProgram() + ", Year ="+ getYear() + ", Fee = " + getFee() + "]";
	}
}
class Staff extends Person {
	private String school;
	private double pay;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString() {
		return "Staff [name = "+ getName() + ", address = " + getAddress() + ", School =  " + getSchool() + ", Pay = " + getPay() + " ]";
	}
}

public class Picture1 {
     public static void main(String[] args) {
	    	   Student S1 = new Student();
	    	   Staff A1 = new Staff();
	    	   
	    	   System.out.println("Student Details: ");
	    	   S1.setName("SSR");
	    	   System.out.println("Name: " +S1.getName());
	    	   S1.setAddress("Kolkata");
	    	   System.out.println("Address: " + S1.getAddress());
	    	   S1.setProgram("Bsc");
	    	   System.out.println("Program: " + S1.getProgram());
	    	   S1.setFee(1000);
	    	   System.out.println("Fee: " + S1.getFee());
	    	   S1.setYear(2001);
	    	   System.out.println("Year: " + S1.getYear());
	    	   
	    	   System.out.println("==================");
	    	   
	    	   System.out.println("Staff Details: ");
	    	   A1.setName("RA");
	    	   System.out.println("Name: " +A1.getName());
	    	   A1.setAddress("Mumbai");
	    	   System.out.println("Address: " + A1.getAddress());
	    	   A1.setSchool("XYZ");
	    	   System.out.println("School: " + A1.getSchool());
	    	   A1.setPay(2000);
	    	   System.out.println("Pay: " + A1.getPay());
	   }
}
