import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----Welcome to our Console Bank Application-----");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Customer Management");
			System.out.println("	3. Customer Account Management");
			System.out.println("	4. Account Transaction");
			System.out.println("	5. Exit\n");

			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Get an Employee");
					System.out.println("	3. Removing an Existing Employee");
					System.out.println("	4. Show All Employees");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							b.insertEmployee(e1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = b.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = b.getEmployee(empId3);
							
							if(e3 != null)
							{
								b.removeEmployee(e3);
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							b.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Customer Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Customer");
					System.out.println("	2. Get a Customer");
					System.out.println("	3. Removing an Existing Customer");
					System.out.println("	4. Show All Customers");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							
							
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
						
							b.insertCustomer(c1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get A Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.getCustomer(nid2);
							
							if(c2 !=null)
							{
								System.out.println();
								System.out.println("Customer NID: "+c2.getNid());
								System.out.println("Customer Name: "+c2.getName());
								c2.showAllAccounts();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = b.getCustomer(nid3);
							
							if(c3 != null)
							{
								b.removeCustomer(c3);
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Customers");
							b.showAllCustomers();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Customer Account Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Account for a Customer");
					System.out.println("	2. Get an Account of a Customer");
					System.out.println("	3. Removing an Existing Account of a Customer");
					System.out.println("	4. Show All Accounts of all Customers");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Account for a Customer\n");
							
							Account a = null;
							
							System.out.println("Which type of Account do you want to Create?\n");
							System.out.println("	1. Savings Account");
							System.out.println("	2. Fixed Account");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								SavingsAccount sa = new SavingsAccount();
								
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b1 = sc.nextDouble();
								System.out.print("Enter Interest Rate: ");
								double ir1 = sc.nextDouble();
								
								sa.setAccountNumber(an1);
								sa.setBalance(b1);
								sa.setInterestRate(ir1);
								
								a = sa;
								
							}
							else if(type == 2)
							{
								FixedAccount fa = new FixedAccount();
								
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b1 = sc.nextDouble();
								System.out.print("Enter Tenure Year: ");
								int ty1 = sc.nextInt();
								
								fa.setAccountNumber(an1);
								fa.setBalance(b1);
								fa.setTenureYear(ty1);
								
								a = fa;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(a!= null)
							{
								System.out.print("Enter Customer NID: ");
								int nid1 = sc.nextInt();
								b.getCustomer(nid1).insertAccount(a);
							}
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get an Account of a Customer\n");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							
							Account a2 = b.getCustomer(nid2).getAccount(an2);
							
							if(a2 != null)
							{
								a2.showInfo();
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Account of a Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an3 = sc.nextInt();
							
							b.getCustomer(nid3).removeAccount(b.getCustomer(nid3).getAccount(an3));
							
							/*
							Customer c3 = b.getCustomer(nid3);
							if(c3 ! = null)
							{
								Account a3 = c3.getAccount(an3);
								
								if(a3 ! = null)
								{
									c3.removeAccount(a3);
								}
							}
							else
							{
								System.out.println("Invalid Input");
							}
							*/
							System.out.println("########################");
							break;
						
						case 4: 
						
							System.out.println("########################");
							System.out.println("Show All Accounts of a Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
							
							b.getCustomer(nid4).showAllAccounts();
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
				case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Account Transactions");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Deposit Money");
					System.out.println("	2. Withdraw Money");
					System.out.println("	3. Transfer Money");
					System.out.println("	4. Show Transaction History");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Deposit Money");
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an1 = sc.nextInt();
							System.out.print("Enter Deposit Amount: ");
							double amount1 = sc.nextDouble();
							
							if(amount1>0)
							{
								b.getCustomer(nid1).getAccount(an1).deposit(amount1);
								frwd.writeInFile("$"+amount1+" has been Deposited in Account Number "+ an1);
								//frwd.writeInFile("Deposit: $"+amount1+" in "+an1);
							}
							System.out.println("#########################");
							break;
							
						case 2:
						
							System.out.println("#########################");
							System.out.println("Withdraw Money");
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							System.out.print("Enter Withdraw Amount: ");
							double amount2 = sc.nextDouble();
							
							if(amount2>0 && amount2<=b.getCustomer(nid2).getAccount(an2).getBalance())
							{
								b.getCustomer(nid2).getAccount(an2).withdraw(amount2);
								frwd.writeInFile("$"+amount2+" has been Withdrawn from Account Number "+ an2);
							}
							System.out.println("#########################");
							break;
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Transfer Money");
							System.out.print("Enter From Customer NID: ");
							int fromNid = sc.nextInt();
							System.out.print("Enter From Account Number: ");
							int fromAN = sc.nextInt();
							System.out.print("Enter Transfer Amount: ");
							double amount3 = sc.nextDouble();
							
							System.out.print("Enter To Customer NID: ");
							int toNid = sc.nextInt();
							System.out.print("Enter To Account Number: ");
							int toAN = sc.nextInt();
							
							if(amount3>0 && amount3<=b.getCustomer(fromNid).getAccount(fromAN).getBalance())
							{
								b.getCustomer(fromNid).getAccount(fromAN).transfer(b.getCustomer(toNid).getAccount(toAN),amount3);
								frwd.writeInFile("$"+amount3+" has been Tranferred from Account Number "+ fromAN +" to Account Number "+toAN);
							}
							System.out.println("#########################");
							break;
						
						case 4:
						
							System.out.println("#########################");
							System.out.println("Show Transaction History\n");
							frwd.readFromFile();
							System.out.println("\n#########################");
							break;
							
						case 5:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
			
			
		}
		
		
	}
}
