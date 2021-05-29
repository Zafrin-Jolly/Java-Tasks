import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account(1111, "OOP1 J", 2000);
		Account a2 = new Account(2222, "OOP1 Q", 3000);
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		c1.setName("AIUB CS");
		c1.setNid(111111111);
		c1.setAccount(a1);
		
		c2.setName("AIUB EEE");
		c2.setNid(111111112);
		c2.setAccount(a2);
		
		//c1.showDetails();
		
		System.out.println("Name: "+ c1.getName());
		System.out.println("Nid: "+ c1.getNid());
		System.out.println("Account Number: "+ c1.getAccount().getAccountNumber());
		System.out.println("Account Holder Name: "+ c1.getAccount().getAccountHolderName());
		System.out.println("Balance: "+ c1.getAccount().getBalance());
		
		System.out.println("Name: "+ c2.getName());
		System.out.println("Nid: "+ c2.getNid());
		System.out.println("Account Number: "+ c2.getAccount().getAccountNumber());
		System.out.println("Account Holder Name: "+ c2.getAccount().getAccountHolderName());
		System.out.println("Balance: "+ c2.getAccount().getBalance());
	}
}




