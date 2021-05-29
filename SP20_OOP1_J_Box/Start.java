import java.lang.*;

public class Start
{
   public static void main (String [] args)	
   {
	   Rectangle R1 = new Rectangle();
	   R1.setLength(9);
	   R1.setWidth(5);
	   R1.showDetails();
	   
	   Triangle T1= new Triangle();
	   T1.setBase(5);
	   T1.setHeight(8);
	   T1.showDetails();
	   
	   Circle C1= new Circle();
	   C1.setRadius(4);
	   C1.showDetails();
	   
	   Square S1= new Square();
	   S1.setSide(3);
	   S1.showDetails();
	   
   }
}