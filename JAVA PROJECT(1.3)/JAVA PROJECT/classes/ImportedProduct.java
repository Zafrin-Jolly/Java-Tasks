package classes;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName){this.countryName = countryName;}
	public String getCountryName(){return countryName;}

	public void showInfo()
	{
		System.out.println("Product Name: "+name);
		System.out.println("PID: "+pid);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Country Name: "+countryName);
		
	}
}