package ru.Babin.Sand_Box;
public class MyFirstProgramJava {
	public static void main(String[] args ){
		//System.out.println("Hallo, world!!!");
		Point p1 = new Point(2.3, 1.2);
		Point p2 = new Point(4.5, 2.3);
		System.out.println(distance(p1,p2));

		System.out.println(p1.mDistance(p2));

	}

	static private double distance(Point p1, Point p2){

		double x1=p1.getX();
		double x2=p2.getX();
		double y1=p1.getY();
		double y2=p2.getY();

		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}