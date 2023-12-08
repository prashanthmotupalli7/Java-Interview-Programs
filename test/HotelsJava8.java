package test;

public class HotelsJava8 {
	private String hotelName;
	private String city;
	private int numberOfRooms;
	private double price;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public HotelsJava8() {
		super();
	}

	public HotelsJava8(String hotelName, String city, int numberOfRooms, double price) {
		this.hotelName = hotelName;
		this.city = city;
		this.numberOfRooms = numberOfRooms;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[hotelName=" + hotelName + ", city=" + city + ", numberOfRooms=" + numberOfRooms
				+ ", price=" + price + "]";
	}
	
	
}
