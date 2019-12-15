import java.util.*;

class q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee[] emps = new Employee[5];
		emps[0] = new TRA("Rajni","TRA1");
		emps[1] = new Professor("P1", "Satish", "CJ", "15/08/1980", "1234567890");
		emps[2] = new AssociateProfessor("AP1", "Satish1", "CJ1", "15/08/1980", "1234567890");
		emps[3] = new AssistantProfessor("ASP1", "Satish2", "CJ2", "15/08/1980", "1234567890");
		emps[4] = new Professor("P2", "Satish3", "CJ3", "15/08/1980", "1234567890");
		System.out.print("Enter employee id: ");
		String id = sc.next();
		for(int i=0;i<5;i++){
			if(emps[i].find(id))
				break;
		}
		sc.close();
	}
}


abstract class Employee{
	String empid;
	String name;
	float computeSalary(int basic, int da){
		return basic + basic*da/100;
	}
	
	boolean find(String id){
		if(id.equals(this.empid)){
			this.showDetails();
			return true;
		}
		return false;
	}
	
	abstract void showDetails();
}

class Dependent{
	String dname;
	String dob;
	String phone;
	
	public Dependent(String dname,String dob,String phone) {
		// TODO Auto-generated constructor stub
		this.dname = dname;
		this.dob = dob;
		this.phone = phone;
	}
	
	void dispDependent(){
		System.out.println("Name: "+dname+"\tDOB: "+dob+"\tPhone No.: "+phone);
	}
}

abstract class PermanentEmp extends Employee{
	Dependent d;	
	public PermanentEmp(String empid,String name,String dname,String dob,String phone) {
		d = new Dependent(dname, dob, phone);
		this.name = name;
		this.empid = empid;
	}
}


class Professor extends PermanentEmp{
	final static String designation = "Professor";
	final static int bp=150000,da=30;
		
	Professor(String empid,String name,String dname,String dob,String phone) {
		super(empid, name, dname, dob, phone);
	}
	
	void showDetails(){
		System.out.printf("Salary= %.2f\nDependent details--\n", computeSalary(bp, da));
		this.d.dispDependent();
	}	
}

class AssociateProfessor extends PermanentEmp{
	final static String designation = "Associate Professor";
	final static int bp=120000,da=20;
		
	AssociateProfessor(String empid,String name,String dname,String dob,String phone) {
		super(empid, name, dname, dob, phone);
	}
	
	void showDetails(){
		System.out.printf("Salary= %.2f\nDependent details--\n", computeSalary(bp, da));
		this.d.dispDependent();
	}	
}

class AssistantProfessor extends PermanentEmp{
	final static String designation = " AssistantProfessor";
	final static int bp=100000,da=10;
		
	AssistantProfessor(String empid,String name,String dname,String dob,String phone) {
		super(empid, name, dname, dob, phone);
	}
	
	void showDetails(){
		System.out.printf("Salary= %.2f\nDependent details--\n", computeSalary(bp, da));
		this.d.dispDependent();
	}	
}

class TRA extends Employee{
	final static String designation = "TRA";
	final static int bp=20000,da=0;
	
	public TRA(String name, String empid) {
		this.empid = empid;
		this.name = name;
	}
	
	@Override
	void showDetails() {
		// TODO Auto-generated method stub
		System.out.printf("Salary= %.2f\n", computeSalary(bp, da));
		
	}
	
}
