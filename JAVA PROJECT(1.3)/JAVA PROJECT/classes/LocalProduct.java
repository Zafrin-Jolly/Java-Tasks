package classes;

public class LocalProduct extends Product
{
	public double discountRate;

	public void setDiscountRate(double discountRate){this.discountRate = discountRate;}
	public double getDiscountRate(){return discountRate;} 

	public void showInfo()
	{
		System.out.println("Product Name: "+name);
		System.out.println("PID: "+pid);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Discount Rate: "+discountRate);
	}
}