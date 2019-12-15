import java.util.*;
class Q2palindrome{
    public static void main(String []args) {
        int n=0,sum=0,temp,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("// 16BCE0721 //");
        System.out.println("Enter a number");
        n = sc.nextInt();
        temp = n;
        while(n>0){    
            r=n%10;  
            sum=(sum*10)+r;    
            n=n/10;    
            }   
        if(temp==sum)    
            System.out.println(temp+" is palindrome number");    
        else    
            System.out.println(temp+" is not a palindrome");      
    }
}