import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Schedule s1 = new Schedule();
		Schedule s2 = new Schedule();

		s1.setHour(1);
		s1.setMinute(40);

		s2.setHour(2);
		s2.setMinute(30);

		Coordinate c1 = new Coordinate();
		Coordinate c2 = new Coordinate();

		c1.setLongitude(126.8);
		c1.setLatitude(65.2);

		c2.setLongitude(412.0);
		c2.setLatitude(111.1);

		Airport a1 = new Airport();
		Airport a2 = new Airport();

		a1.setName("ABC");
		a1.setLocation(c1);

		a2.setName("abc");
		a2.setLocation(c2);

		Flight f1 = new Flight();

		f1.setFlightId("123");
		f1.setCapacity(100);
		f1.setDepartureFrom(a1);
		f1.setDepartureTime(s1);
		f1.setFlyingTo(a2);
		f1.setArrivalTime(s2);

		System.out.println("Flight ID: "+f1.getFlightId());
		System.out.println("Capacity: "+f1.getCapacity());
		System.out.println();
		System.out.println();
		System.out.println("Airports Name: "+f1.getDepartureFrom().getName());
		System.out.println("Airports Longitude: "+f1.getDepartureFrom().getLocation().getLongitude());
		System.out.println("Airports Latitude: "+f1.getDepartureFrom().getLocation().getLatitude());
		System.out.println("Departing Hour: "+f1.getDepartureTime().getHour());
		System.out.println("Departing Minute: "+f1.getDepartureTime().getMinute());
		System.out.println();
		System.out.println();
		System.out.println("Airports Name: "+f1.getFlyingTo().getName());
		System.out.println("Airports Longitude: "+f1.getFlyingTo().getLocation().getLongitude());
		System.out.println("Airports Latitude: "+f1.getFlyingTo().getLocation().getLatitude());
		System.out.println("Arriving Hour: "+f1.getArrivalTime().getHour());
		System.out.println("Arriving Minute: "+f1.getArrivalTime().getMinute());
	}
}