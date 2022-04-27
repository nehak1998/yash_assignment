import java.util.*;
import java.util.stream.Collectors;
public class City {
	String name;
	int population;
	int area;
	
	City(String name,int population, int area)
	{
		this.name	=	name;
		this.population	=	population;
		this.area	=	area;
	}
	
	public static void main(String args[])
	{
		ArrayList<City>city = new ArrayList<City>();
		city.add(new City("Pune",17800,5430));
		city.add(new City("Nashik",15900,2870));
		city.add(new City("Mumbai",27000,3896));
		
		City maxPopulation =	city.stream().max((obj1,obj2)->obj1.population > obj2.population ? 1:-1) .get();
		System.out.println(maxPopulation.name);
	
		List<Integer>namesets = city.stream().map(e -> e.population).collect(Collectors.toList());
		System.out.println(namesets);
		
		City minArea = city.stream().min((obj1,obj2)->obj1.area > obj2.area ?1:-1).get();
		System.out.println(minArea.name);
	}
}
