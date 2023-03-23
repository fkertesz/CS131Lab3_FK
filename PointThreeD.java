package arraylist;
/**
 * this class is used to create a PointThreeD object
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 3
 * CS131-01
 */
public class PointThreeD
{
	double xPoint;//stores value of coordinate x
	double yPoint;//stores value of coordinate y
	double zPoint;//stores value of coordinate z
	
	/*
	 * empty-argument constructor that sets all coordinate points
	 * to 0
	 */
	public PointThreeD()
	{
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end constructor
	
	/*
	 * preferred-argument constructor that sets preferred coordinates
	 * @param x the preferred x coordinate
	 * @param y the preferred y coordinate
	 * @param z the preferred z coordinate
	 */
	public PointThreeD(double x, double y, double z)
	{
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end constructor

	/*
	 * getter for x coordinate
	 * @return x coordinate
	 */
	public double getxPoint() {
		return xPoint;
	}//end getxPoint

	/*
	 * setter for x coordinate
	 * @param new x coordinate
	 */
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint

	/*
	 * getter for y coordinate
	 * @return y coordinate
	 */
	public double getyPoint() {
		return yPoint;
	}//end getyPoint

	/*
	 * setter for y coordinate
	 * @param new y coordinate
	 */
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setyPoint

	/*
	 * getter for z coordinate
	 * @return z coordinate
	 */
	public double getzPoint() {
		return zPoint;
	}//end getzPoint

	/*
	 * setter for z coordinate
	 * @param new z coordinate
	 */
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint

	/*
	 * converts 3d point into string
	 * @return PointThreeD traits
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class
