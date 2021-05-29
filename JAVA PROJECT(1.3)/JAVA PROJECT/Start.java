import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;

		while(choice)
		{
		
			System.out.println();
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			try
			{
			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println();
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();

					switch(input1)
					{
						case 1:
							
						
							System.out.println();
							System.out.println("#####################");
							System.out.println("Insert New Employee");
						
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							boolean flag=true;
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
						
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							m.insertEmployee(e1);
							
							System.out.println("#####################");							
							break;

						case 2:
							System.out.println();
							System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
		
							m.removeEmployee(m.getEmployee(empId3));
	
							System.out.println("#####################");
							break;	

						case 3:
							System.out.println();
							System.out.println("#####################");
							System.out.println("Show All Employees");
							m.showAllEmployees();
							System.out.println("#####################");
							break;	

						case 4:
							System.out.println();
							System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = m.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;	

						case 5:
							System.out.println();
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println();
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;

				case 2:
				
					System.out.println("********************");
					System.out.println("Shop Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove an Existing Shop");
					System.out.println("3. Show All Shop");
					System.out.println("4. Get A Shop");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					

					switch(input2)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
			
							Shop c1 = new Shop(); 
							c1.setSid(sid1);
							c1.setName(name1);
				
							m.insertShop(c1);
							
							System.out.println("#####################");
							break;
							
						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
						
							m.removeShop(m.getShop(sid3));
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Shop");
							m.showAllShops();
							System.out.println("#####################");
							break;	

						case 4:
							
							System.out.println("#####################");
							System.out.println("Search A Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							
							if(s2 !=null)
							{
								System.out.println("Shop ID: "+s2.getSid());
								System.out.println("Shop Name: "+s2.getName());
								System.out.println("/----------------------------------/");
								s2.showAllProducts();
								System.out.println("/----------------------------------/");
								
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							System.out.println("#####################");
							break;	

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;

				case 3:
				
					System.out.println("********************");
					System.out.println("Shop Product Management");
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Product");
					System.out.println("2. Remove an Existing Product");
					System.out.println("3. Show All Product");
					System.out.println("4. Search A Product");
					System.out.println("5. Go Back"); 
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					

					switch(input3)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Insert New Product\n");
							System.out.println("Which Type of Product Do you Want to Insert?");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							Product p = null;
							
							if(type == 1)
							{
								System.out.print("Enter Product Name: ");
								String pn1 = sc.next();
                                System.out.print("Enter Product ID: ");
                                String pid1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Product Price: ");
								int pp1 = sc.nextInt();
								System.out.print("Enter Discount Rate: ");
								double dr1 = sc.nextDouble();
								
								LocalProduct lp = new LocalProduct();
								
								lp.setName(pn1);
								lp.setAvailableQuantity(aq1);
								lp.setPrice(pp1);
								lp.setPid(pid1);
								lp.setDiscountRate(dr1);
								
								p = lp;
							}
							else if(type == 2)
							{
								System.out.print("Enter Product Name: ");
								String pn1 = sc.next();
                                System.out.print("PID: ");
                                String pid1 = sc.next();
								System.out.print("Available Quantity: ");
								int aq1  = sc.nextInt();
								System.out.print("Enter Product Price: ");
								int pp1 = sc.nextInt();
								System.out.print("Enter Country Name: ");
								String cn1 = sc.next();
								
								ImportedProduct ip = new ImportedProduct();
								
								ip.setName(pn1);
								ip.setAvailableQuantity(aq1);
								ip.setPrice(pp1);
								ip.setPid(pid1);
								ip.setCountryName(cn1);
							
								p = ip;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(p != null)
							{
								System.out.print("Enter Shop ID: ");
								String sid1 = sc.next();
								
								m.getShop(sid1).insertProduct(p);
								
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Remove an Existing product");
							
							System.out.print("Enter Product PID: ");
							String pid2 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pid2));
			
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show All Product");
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
							
							m.getShop(sid3).showAllProducts();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Search A Product ");
							
							System.out.print("Enter Product ID: ");
							String pid4 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							
							Product pp = m.getShop(sid4).getProduct(pid4);

							if(pp != null)
							{
								pp.showInfo();
							}
							
							System.out.println("#####################");
							break;
						
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;

				case 4:
				
					System.out.println("********************");
					System.out.println("product Quantity Add-Sell");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("4. Show Add Sell History");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();

					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add Product\n");

							System.out.print("Enter Product Id: ");
							String pid1 = sc.next();							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Add Quantity: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								m.getShop(sid1).getProduct(pid1).addQuantity(amount1);

								frwd.writeInFile("Add-Quantity: "+ amount1+" piece of "+m.getShop(sid1).getProduct(pid1).getName()+"(Id="+ pid1+") in "+m.getShop(sid1).getName()+" Shop.");
							}
							else
							{
								System.out.println("Product can not be add, invalid ammount.");
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell Product");
							
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Sell Quantity: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= m.getShop(sid2).getProduct(pid2).getAvailableQuantity())
							{
								m.getShop(sid2).getProduct(pid2).sellQuantity(amount2);

								frwd.writeInFile("Sell-Quantity: "+ amount2+" piece of "+m.getShop(sid2).getProduct(pid2).getName()+"(Id="+ pid2+") from "+m.getShop(sid2).getName()+" Shop.");
							}
							else
							{
								System.out.println("Product can not be sold, invalid ammount.");
							}
							
							System.out.println("#####################");
							break;

						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
			
						
			}
			}
			catch(InputMismatchException ime)
			{
				System.out.println("InputMismatchException occured");
				ime.printStackTrace();
				String xyz = sc.next();
			}
			catch(NullPointerException npe)
			{
				System.out.println("NullPointerException occured");
				npe.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("ArrayIndexOutOfBoundsException occured");
				aie.printStackTrace();
				String xyz = sc.next();
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("NumberFormatException occured");
				nfe.printStackTrace();
				String xyz = sc.next();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException occured");
				ae.printStackTrace();
				String xyz = sc.next();
			}
			catch(Exception e)
			{
				System.out.println("Exception occured " + e.getMessage());
				e.printStackTrace();
				String xyz = sc.next();
			}
		}
	}
}
							