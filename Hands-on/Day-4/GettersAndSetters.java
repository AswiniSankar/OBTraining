package com.corejava.basics;
class Shapes{
	private double lenght;
	private double breath;
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	
}
class Sqaure extends Shapes{
	void area() {
		System.out.println("area is: "+ getLenght()*getLenght());
	}
}
class Rectangles extends Shapes{
	void area() {
		System.out.println("area is: "+ getBreath()*getLenght());
	}
}
class Triangles extends Shapes{
	void area() {
		System.out.println("area is: "+ (getBreath()*getLenght())/2);
	}
}
public class GettersAndSetters {
	public static void main(String[] args) {
	  Rectangles rec = new Rectangles();
	  rec.setBreath(10);
	  rec.setLenght(10);
	  rec.area();
	  Triangles tri =new Triangles();
	  tri.setBreath(12);
	  tri.setLenght(5);
	  tri.area();
	  Sqaure sq = new Sqaure();
	  sq.setLenght(20);
	  sq.area();
	}

}
