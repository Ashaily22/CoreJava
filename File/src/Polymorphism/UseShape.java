package Polymorphism;

public class UseShape {

	public static void main(String[] args) {
		Shape shape= new Shape();
		/*int trianglearea=shape.areaofland(3, 4, 7);
		System.out.println("area of triangle:"+ trianglearea);

		int rectanglearea=shape.areaofland(5, 4, 7, 7);*/
		System.out.println("area of triangle:"+ shape.areaofland(4, 7, 5));
		System.out.println("area of rectangle:"+ shape.areaofland(4, 7, 5,4));
		

	}

}
