import java.util.*;
public class Jagged
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count,slow,num=0;
		int batches[][]=new int [4][];
		for(int i=1;i<3;i++)
		{
			System.out.println("Enter number of slow learners in the batch "+(i));
			slow=sc.nextInt();
			count=(slow/4)+1;
			batches[i]=new int [count];
			for(int j=0;j<count;j++)
			{
				if(slow>=4)
					batches[i][j]=4;
				else if(slow<=0)
					batches[i][j]=0;
				else
					batches[i][j]=slow;
				slow-=4;
			}
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.println("Batch "+(i+1));
			for(int j=0;j<batches[i].length;j++)
			{
				if(batches[i][j]!=0){
					System.out.print(batches[i][j]+" ");
					if(batches[i][j]==4)
						num++;
				}
			}
			System.out.println();
			System.out.println("Number of batches in which all tutors have 4 students are = "+num);
			System.out.println();
		}
		
	}
}

			