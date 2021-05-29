package classes;

import interfaces.*;

public class Market implements ShopOperations,EmployeeOperations
{
	private Shop shops[] = new Shop[300]; 
	private Employee employees[] = new Employee[200];

	public void insertShop(Shop s)
	{
		int flag = 0;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Shop Inserted");}
		else{System.out.println("Invalid Input or Not Enough space, Shop can Not be Inserted");}
	}

	public void removeShop(Shop s)
	{
		int flag = 0;

		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Shop Removed");}
		else{System.out.println("Invalid Input, Shop can Not be Removed");}
	}

	public Shop getShop(String sid) 
		{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				if(shops[i].getSid().equals(sid))
				{
					s = shops[i];
					break;
				}
			}
		}
	
		return s;
	}
	
	
	public void showAllShops()
	{
		System.out.println("/////////////////////////////////");
		for(Shop s : shops)
		{
			if(s!= null)
			{
				System.out.println("Shop Name: "+ s.getName());
				System.out.println("Shop's Sid: "+ s.getSid());
				System.out.println("/----------------------------------/");
				s.showAllProducts();
				System.out.println("/----------------------------------/");
			}
		}
		System.out.println("/////////////////////////////////");
	}

	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Employee Inserted");}
		else{System.out.println("Invalid Input or Not Enough space, Employee can Not be Inserted");}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Invalid Input, Employee can Not be Removed");}
	}
	
	
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
	
		return e;
	}
	
	
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println();
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}
}