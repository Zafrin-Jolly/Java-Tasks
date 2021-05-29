import java.lang.*;

public class Square
{
	private double side;
	private double area;
	
	public Square()
	{ System.out.println("Square");   }
	
	public void setSide(double side) {this.side=side;}
	public double getSide () { return side;  }
	public double getArea () { return side*side; }
	public void showDetails()
	{
		System.out.println("side:"+side);
		System.out.println("area:"+getArea());
	}
}