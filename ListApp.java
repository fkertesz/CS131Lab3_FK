package arraylist;
/**
 * this class tests the ArrayList, Square, and PointThreeD classes and
 * the methods of ArrayList
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 3
 * CS131-01
 */
public class ListApp
{
	/*
	 * main method
	 */
	public static void main(String[] args)
	{
		//declaring ArrayList objects of type String, Square, and PointThreeD
		ArrayList<String> stringL = new ArrayList<String>();
		ArrayList<Square> squareL = new ArrayList<Square>();
		ArrayList<PointThreeD> pointL = new ArrayList<PointThreeD>(5);//set array length of 5
		
		//adding 3 new items to String array
		stringL.addItem(new String("a string"));
		stringL.addItem(new String("another string!"));
		stringL.addItem(new String("one more"));
		
		//adding 3 new items to Square array
		squareL.addItem(new Square());
		squareL.addItem(new Square(5));
		squareL.addItem(new Square(3.14));
		
		//adding 3 new items to PointThreeD array
		pointL.addItem(new PointThreeD());
		pointL.addItem(new PointThreeD(-1.1,-2.2,-3.3));
		pointL.addItem(new PointThreeD(3,1,4));
		
		//testing and printing out toString method for 3 objects
		System.out.println(stringL.toString());
		System.out.println(squareL.toString());
		System.out.println(pointL.toString());
		
	}//end main
}//end class
