interface Binary{
	void show();
}
public class BinarySearch {
	public static void main(String args[]) {
		Binary b = ()-> {
			int a[] = {2,5,8,5,9,11};
			int search = 9;
			int low = 0;
			int high = a.length - 1;
			int mid = (low + high)/2;
			while(low<=high)
			{
				if(a[mid] == search)
				{
					System.out.println("Element is found at "+mid+" position");
					break;
				}
				else if(a[mid]<search)
				{
					low = mid + 1;
				}
				else
				{
					high = mid - 1;
					
				}
				mid = (low+high)/2;
			}
			if(low > high)
			{
				System.out.println("Element not found...");
			}
		};
		b.show();
	}
}
