interface A{
	void show();
}
public class MaxNo {
	public static void main(String args[]) {
		A a1 = () ->
		{
			int a[] = {10,37,9,11,45};
			int max = a[0];
			for(int i =0;i<a.length;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
			System.out.println(max);
		};
		a1.show();
	}
	
}
