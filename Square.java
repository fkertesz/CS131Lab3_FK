package arraylist;
/**
 * this class is used to create a Square object
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 3
 * CS131-01
 */
public class Square
{
	double side;//variable store square side length
	
	/*
	 * empty-argument constructor that sets the side to length of unit 1
	 */
	public Square()
	{
		side = 1;
	}//end constructor
	
	/*
	 * preferred-argument constructor that sets the side length to
	 * preferred side length
	 * @param s preferred side length
	 */
	public Square(double s)
	{
		side = s;
	}//end constructor
	
	/*
	 * calculates the area of the square
	 * @return area of the square
	 */
	public double getArea()
	{
		return side*side;
	}//end getArea

	/*
	 * getter for side
	 * @return side length
	 */
	public double getSide() {
		return side;
	}//end getSide

	/*
	 * setter for side
	 * @param side
	 */
	public void setSide(double side) {
		this.side = side;
	}//end setSide

	/*
	 * converts square into string
	 * @return square trait
	 */
	@Override
	public String toString()
	{
		return "Square [side=" + side + "]";
	}//end toString
	
}//end class
