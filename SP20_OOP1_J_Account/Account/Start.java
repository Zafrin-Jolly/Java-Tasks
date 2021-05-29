import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(1111);
		a1.setAccountHolderName("OOP1 J");
		a1.setBalance(2000);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance()+"TK");
		
		
		Account a2 = new Account(1112, "OOP1 M", 2200);
		a2.showDetails();
	}
}