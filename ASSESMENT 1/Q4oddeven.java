import java.util.Scanner;
class Q4oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("// 16BCE0721 //");
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" ODD : ");
        for(int i=0;i<n;i++)
            if(arr[i]%2 != 0)
                System.out.print(" "+arr[i]);

        System.out.println("");

        System.out.println(" EVEN : ");
        for(int i=0;i<n;i++)
            if(arr[i]%2 == 0)
                System.out.print(" "+arr[i]);
        
    }
}