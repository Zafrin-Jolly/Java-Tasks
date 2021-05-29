import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account(1111, "OOP1 J", 2000);
		Account a2 = new Account(2222, "OOP1 Q", 3000);
		Account a3 = new Account(3333, "OOP1 M", 2000);
		Account a4 = new Account(4444, "ICS B16", 3000);
		Account a5 = new Account(5555, "ICS B25", 3000);
		
		Customer c1 = new Customer("Mohaimen", 1751, 4);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		c1.insertAccount(a5);

		System.out.println("----------------------------");
		
		System.out.println("Name: "+ c1.getName());
		System.out.println("NID: "+ c1.getNid());
		c1.showAllAccounts();
		System.out.println("----------------------------");
		
		
		c1.removeAccount(a2);
		
		System.out.println("----------------------------");
		
		System.out.println("Name: "+ c1.getName());
		System.out.println("NID: "+ c1.getNid());
		c1.showAllAccounts();
		System.out.println("----------------------------");
		
		c1.insertAccount(a5);
		
		System.out.println("----------------------------");
		
		System.out.println("Name: "+ c1.getName());
		System.out.println("NID: "+ c1.getNid());
		c1.showAllAccounts();
		System.out.println("----------------------------");
		
		c1.removeAccount(a2);
	}
}




