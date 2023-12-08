package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWithListOfEmp {
public static void main(String[] args) {
	Map<String,List<String>> map= new HashMap<>();
	map.put("Bahubali", List.of("Prabhas", "Rana", "Anushka", "Tammana"));
	map.put("RRR", List.of("Ram Charan", "NTR", "Alia Bhatt", "Overy"));
	map.put("F2", List.of("Venkatesh", "Varun Tej", "Tamm", "Meharin"));
	map.put("Pushpa", List.of("Allu arjun", "Sunil", "Rashmika", "Anasuya"));
	
	map.values()
	   .stream()
	   .flatMap(List::stream)
	   .forEach(System.out::println);
	
Long count =	map.values()
	   .stream()
	   .flatMap(List::stream).collect(Collectors.counting());
	  System.out.println("Total count of employees :  "+count);
	  
	  
      map.forEach((movie, actors) -> 
      System.out.println(movie + ": " + actors.size() + " actors")
  );
	  

	  
}
}
