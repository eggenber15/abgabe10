package at.fhj.itm;

/**
 * Creates new 2D-Points. 
 * @author danieleggenberger
 *
 */
class Point2d {
	private boolean debug;
	private double x, y;

	/**
	 * Constructor.
	 * @param px X-Value of Point
	 * @param py Y-Value of Point
	 */
	public Point2d(double px, double py) { 
		x = px;
		y = py;
	}

	/**
	 * Constructor.
	 * No params.
	 */
	public Point2d() {		
		x = 0.0;
		y = 0.0;
	}

	/**
	 * Constructor.
	 * @param pt Contains X- and Y-Coordinates.
	 */
	public Point2d(Point2d pt) {
		x = pt.getX();
		y = pt.getY();
	}

	/**
	 * Prints "Debug: </code>String</code>", if debug == true
	 * @param s Print after "Debug: "
	 */
	public void dprint(String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Turn debugging on or off.
	 * @param b Turns debugging on/off
	 */
	public void setDebug(boolean b) {
		debug = b;
	}

	/**
	 * Sets X-Coordinate.
	 * @param px X-Coordinate of Point.
	 */
	public void setX(double px) {
		dprint("setX(): Changing value of X from " + x + " to " + px);
		x = px;
	}

	/**
	 * Returns X-Coordinate.
	 * @return X-Coordinate of Point.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets Y-Coordinate.
	 * @param py Y-Coordinate of point.
	 */
	public void setY(double py)  {
		dprint("setY(): Changing value of Y from " + y + " to " + py);
		y = py;
	}

	/**
	 * Returns Y-Coordinate.
	 * @return Y-Coordinate of point.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets X- and Y-Coordinate of point.
	 * @param px X-Coordinate to set.
	 * @param py Y-Coordinate to set.
	 */
	public void setXY(double px, double py) {
		x = px;
		y = py;
	}

	/**
	 * Distance from another Point.
	 * @param pt Distance gets calculated from this point.
	 * @return Distance, from this point to <code>pt</code>
	 */
	public double distanceFrom(Point2d pt) {
		double newx = this.x - pt.getX();
		double newy = this.y - pt.getY();
		return Math.sqrt(newx*newx+newy*newy);
	}

	/**
	 * Distance from origin another point.
	 * @return Distance, from origin to this point.
	 */
	public double distanceFromOrigin() {
		double newx = this.x;
		double newy = this.y;
		return Math.sqrt(newx*newx+newy*newy);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "x" + x + ", y" + y;
	}
}

