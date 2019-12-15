import java.io.*;

class Practice{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter username: ");
		String uname = br.readLine();
		System.out.print("Enter password: ");
		String upass = br.readLine();
		System.out.print("Confirm password: ");
		String cpass = br.readLine();
		if(uname.length()<8)
			System.err.println("Invaid username length");
		if(upass.length()<8)
			System.err.println("Invalid password length");
		if(uname.contains(" ") || upass.contains(" "))
			System.err.println("Username or Password should not contains space");
		if(!upass.equals(cpass))
			System.err.println("Passwords don't match");
		for(int i=0;i<uname.length()-2;i++){
			if(upass.contains(uname.substring(i, i+3)))
				System.err.println("Password cannot contain username");
		}
	}
}