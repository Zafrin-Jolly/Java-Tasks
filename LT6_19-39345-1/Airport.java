import java.lang.*;
public class Airport
{
private String name;
private Coordinate location;

public void setName(String name)
{
	this.name=name;
}
public void setLocation(Coordinate location)
{
	this.location=location;
}
public String getName(){return name;}
public Coordinate getLocation(){return location;}
}
