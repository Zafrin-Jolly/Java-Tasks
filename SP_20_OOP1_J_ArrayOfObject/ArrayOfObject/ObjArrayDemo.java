import java.lang.*;

public class ObjArrayDemo
{
	public static void main(String args[])
	{
		Box boxes[] = new Box [5];
		
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.setLength(1.1);
		
		boxes[0] =b1;
		boxes[1] =b2;
		
		b2.setLength(2.2);
		
		boxes[2] = new Box();
		boxes[2].setLength(3.3);
		
	//	boxes[3] = new Box();
		boxes[4] = new Box();
		
		for(int i = 0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("boxes["+i+"] Length : "+boxes[i].getLength());
				System.out.println("boxes["+i+"] Width : "+boxes[i].getWidth());
				System.out.println("boxes["+i+"] Height : "+boxes[i].getHeight());
			}
		}
		
		for(Box b : boxes)
		{
			if(b != null)
			{
				System.out.println(b.getLength());
				System.out.println(b.getWidth());
				System.out.println(b.getHeight());
			}
		}
		
	}
}