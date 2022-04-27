import java.util.*;
import java.util.stream.Collectors;
public class StudentName {
	public static void main(String args[]) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Neha");
		name.add("ankita");
		name.add("sayli");
		name.add("Ashish");
		name.add("anuja");
		
		List<String>list = name.stream().filter(x -> x.toUpperCase().charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("The Names start with 'A' or 'a' : "+list);
	}
}
