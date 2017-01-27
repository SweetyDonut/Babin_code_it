package ru.Babin.Sand_Box;
public class MyFirstProgramJava {
	public static void main(String[] args ){
		//System.out.println("Hallo, world!!!");

		Square s= new Square(5);
        System.out.println("Площадь квадрата = "+ s.area());

        Rectangle r= new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника = "+ s.area());


		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(0.0, -1.0);


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