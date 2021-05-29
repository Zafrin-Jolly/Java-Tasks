import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	

	public Account()
	{
		System.out.println("Empty Constructor - Account");
	}
	
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		System.out.println("Para Constructor - Account");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: $"+balance);
	}
	
	
}