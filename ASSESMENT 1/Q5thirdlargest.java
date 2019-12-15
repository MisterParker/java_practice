import java.util.Scanner;
class Q5thirdlargest{
    public static int thirdlargest(int[] a){  
        int l = a.length; 
        int temp; 
        for (int i=0;i<l;i++)
        for (int j=i+1;j<l;j++)   
        {  
            if (a[i] > a[j])   
            {  
                temp = a[i];  
                a[i] = a[j];  
                a[j] = temp;  
            }  
        }   
            return a[l-3];  
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("// 16BCE0721 //");
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans = thirdlargest(arr);
        System.out.println("Third largest number : "+ans);
    }
}