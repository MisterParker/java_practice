import java.io.*; 
import java.util.Scanner;
class Q6pascal{
	static void printPascal(int n) { 
        for (int line = 0; line < n; line++){
            for (int i = 0; i <= line; i++) 
            System.out.print(binomialCoeff(line, i)+" "); 
                            
            System.out.println(); 
        } 
    } 
    
	static int binomialCoeff(int n, int k) { 
		int nCr = 1; 
		
		if (k > n - k) 
		k = n - k; 
			
		for (int i = 0; i < k; ++i) 
		{ 
			nCr *= (n - i); 
			nCr /= (i + 1); 
		} 
		return nCr; 
	} 
	
	// Driver code 
	public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depth of the pascal tree");
        int n = sc.nextInt(); 
        printPascal(n); 
	} 
}