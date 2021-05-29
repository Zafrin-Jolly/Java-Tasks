package classes;

import interfaces.*;

public class Shop implements ProductOperations
{
	private String name;
	private String sid;
	private Product products[] = new Product [200];
	
	
	public void setName(String name){this.name = name;}
	public void setSid(String sid){this.sid = sid;}
	
	
	public String getName(){return name;}
	public String getSid(){return sid;}
	
	public void insertProduct(Product p)
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Product Inserted");}
		else{System.out.println("Invalid Input or Not Enough space,Product Can Not Insert");}
		System.out.println();
	}
	
	public void removeProduct(Product p)
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Product Removed");}
		else{System.out.println("Invalid Input, Product Can Not Remove");}
		System.out.println();
	}
	
	public Product getProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid().equals(pid))
				{
					p = products[i];
					break;
				}
			}
		}
		
		return p;
	}
	
	public void showAllProducts()
	{
		boolean flag=true ;
		for(Product p : products)
		{
			if(p != null)
			{
				System.out.println();
				p.showInfo();
				System.out.println();
				flag=false;
			}
		}
		if(flag){System.out.println("Shop is empty.");}
	}
}