package at.fhj.itm;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Point2dTest {
	Point2d p2d;

	@Before
	public void setup() {
		p2d = new Point2d();
	}
	
	@Test
	public void testSetX(){
		p2d.setX(23);
		assertEquals(23.0, p2d.getX(), 0.00001);
	}

	@Test
	public void testSetY(){
		p2d.setY(79);
		assertEquals(79.0, p2d.getY(), 0.0001);
	}
	
	@Test
	public void testDistanceFrom(){
		Point2d p2d2 = new Point2d();
		p2d2.setXY(0, 0);
		p2d.setXY(4, 3);
		assertEquals(5.0, p2d.distanceFrom(p2d2), 0.0001);
	}

	@Test
	public void testDistanceFromOrigin(){	
		p2d.setX(4);
		p2d.setY(3);
		assertEquals(5.0, p2d.distanceFromOrigin(), 0.00001);
	}
	
	@Test
	public void testDistanceFrom5050() {
		p2d.setX(4);
		p2d.setY(3);
		assertEquals(Math.sqrt(46*46+47*47), p2d.distanceFrom(new Point2d(50, 50)), 0.00001);
	}
}
