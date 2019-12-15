import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int j=n-i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=n-i;j<=n;j++){
                System.out.print("*");
            }
            for(int j=i+1;j<n;j++){
                System.out.print("  ");
            }
            for(int j=n-i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}