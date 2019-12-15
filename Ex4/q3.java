import java.io.*;

class Student{
	String name,regno,phone;
	static int studCount=0;
	void getInfo() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Details of Student"+ (int)(++studCount));
		System.out.print("Enter Name: ");
		name = br.readLine();
		System.out.print("Enter Registration No.: ");
		regno = br.readLine();
		System.out.print("Enter Phone No.: ");
		phone = br.readLine();
	}
	void displayInfo(){
		System.out.println("Name: "+name+ "\tRegistration no.: "+regno+
				"\tPhone no.: "+phone);
	}
	
	static Student[] sortobj(Student[] students){
		Student temp = new Student();
		for(int i=0;i<students.length-1;i++){
			for(int j=i+1;j<students.length;j++){
				if(students[i].name.compareTo(students[j].name)>0){
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}		
		return students;		
	}
	
}

class q3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of students: ");
		int n = Integer.parseInt(br.readLine());
		Student[] students = new Student[n];
		for(int i=0;i<n;i++){
			students[i] = new Student();
			students[i].getInfo();
		}
		students = Student.sortobj(students);
		for(int i=0;i<n;i++){
			students[i].displayInfo();
		}
	}
}