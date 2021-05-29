import java.lang.*;
public class Coordinate
{
	private double longitude;
	private double latitude;
	
	public void setLongitude(double longitude)
	{
		this.longitude=longitude;
	}
	public void setLatitude(double latitude)
	{
		this.latitude=latitude;
	}
	public double getLongitude(){return longitude;}
	public double getLatitude(){return latitude;}
}