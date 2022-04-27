import java.util.*;
interface Character{
	void show();
}
public class FindCharacter {
	public static void main(String args[]) {
		Character c = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index no: ");
			int n = sc.nextInt();
			String s1 = "Neha";
			for(int i =0; i<s1.length(); i++)
			{
				if(i == n) 
					System.out.println("Character at index "+n+" is "+s1.charAt(i));
			}
		};
		c.show();
	}
}
