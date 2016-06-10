package at.fhj.itm;

public class Main {
	public static void main(String[] args) {

		int numA = Integer.parseInt(args[0]);
		int numB = Integer.parseInt(args[1]);
		int numC = Integer.parseInt(args[2]);
		int numD = Integer.parseInt(args[3]);
		

		Point2d p = new Point2d(numA, numB);
		
		if(args.length != getMinArgs()) {
			System.out.println(getUsage());
			return;
		}

		try {
			Point2d p2 = new Point2d(numC, numD);
			double result = p.distanceFrom(p2);
			System.out.println(result);
		}
		catch(Exception ex) {
			System.out.print("Invalid operation: " + ex.getMessage());
		}

	}
	
	public static int getMinArgs() {
		return 4;
	}
	
	public static String getUsage() {
		return "usage: <x-coordinate of point 1> <y-coordinate of point 1> <x-coordinate of point 2> <y-coordinate of point 2>";
	}

}
