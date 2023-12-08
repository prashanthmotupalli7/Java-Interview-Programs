package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelsJava8Test {

	public static void main(String[] args) {
		
		List<HotelsJava8> hotelList=new ArrayList<>();
		hotelList.add(new HotelsJava8("Green Bawarchi","Habsiguda",20,20000));
		hotelList.add(new HotelsJava8("Pista House","Uppal",15,30000));
		hotelList.add(new HotelsJava8("Novotol","Vijaywada",85,25000));
		hotelList.add(new HotelsJava8("Krshna Residency","Habsiguda",10,1500));
		hotelList.add(new HotelsJava8("Swagath Grand","Nacharam",35,10000));
		hotelList.add(new HotelsJava8("KB","Ongole",45,45000));

		
		//get list of hotels in Habsiguda
		hotelList.stream().
				filter(hotels->hotels.getCity().equals("Habsiguda"))
				.collect(Collectors.toList()).forEach(System.out::println);
		
		//sorting the objects based on prices
		hotelList.stream().sorted(Comparator.comparingDouble(HotelsJava8::getPrice))
		.forEach(System.out::println);
		
		//sorting the objects based on prices in reverse order
		System.out.println("######## PRINTING HOTELS PRICE IN REVERSE ORDER #############");
		hotelList.stream().sorted(Comparator.comparingDouble(HotelsJava8::getPrice).reversed())
		.forEach(System.out::println);
		
       // printing the hotel name and number of rooms 
		System.out.println("######## PRINTING HOTELS AND NUMBER OF ROOMS #############");
		hotelList.stream().forEach(hotels ->System.out.println("HOTEL NAME : "+hotels.getHotelName()+" :: "+"NUMBER OF ROOMS : "+hotels.getNumberOfRooms()));

	       // printing the hotel name with room price greater than 25000
		System.out.println("######## PRINTING HOTELS WITH ROOMS PRICE GREATER THAN 25000 #############");
		hotelList.stream().filter(hotels->hotels.getPrice()>25000)
		.forEach(hotels ->System.out.println("HOTEL NAME : "+hotels.getHotelName()+" :: "+"NUMBER OF ROOMS : "+hotels.getNumberOfRooms()));

      //city with count of hotels
		System.out.println("######## PRINTING HOTELS AND COUNT OF THE CITY #############");
		Map<String,Long> CityWithNoOfHotels =hotelList.stream().collect(Collectors.groupingBy(HotelsJava8::getCity, Collectors.counting()));
		CityWithNoOfHotels.forEach((city,count)->System.out.println("City "+city+" : "+" Count of Hotels "+count));

	}
}
