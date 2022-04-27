import java.util.*;
public class DuplicateNo {
	public static void main(String args[]) {
		int a[] = {1,1,9,9,9,8,6,4,5,3};
		int count = 0;
		//int n = 1;
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		n = sc.nextInt();
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == n)
				count++;
		}
		System.out.println("Number:"+n+" occurs "+count+" times");
	}
}
