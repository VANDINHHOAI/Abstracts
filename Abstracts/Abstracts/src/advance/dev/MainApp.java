package advance.dev;

import java.util.Scanner;
import java.util.Iterator;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		maxCircle(shapes);
		System.out.println("Hinh co dien tich lon nhat la: ");
		printMaxDienTich(shapes);
		System.out.println("Dien tich lon nhat cua moi hinh: ");
		printMaxDienTichCacHinh(shapes);
	}

	private static void maxCircle(Shape[] shapes) {
		// TODO Auto-generated method stub
		double max = 0.0;
		int n = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				double temp = shape.dienTich();
				
				if (temp > max) {
					max = temp;
				}
			}
		}
		
		System.out.println("Dien tich: " + max);
	}

	private static void printMaxDienTichCacHinh(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (Shape shape : shapes) {
	        if (shape instanceof Triangle) {
	            System.out.println("Tam giac co dien tich lon nhat la: " + shape.dienTich());
	        } else if (shape instanceof Rectangle) {
	            System.out.println("Hinh chu nhat co dien tich lon nhat la: " + shape.dienTich());
	        } else if (shape instanceof Circle) {
	            System.out.println("Hinh tron co dien tich lon nhat la: " + shape.dienTich());
	        }
	    }
	}

	private static void printMaxDienTich(Shape[] shapes) {
		// TODO Auto-generated method stub
		Shape max = shapes[0];
		for (int i = 1; i < shapes.length; i++) {
			if (shapes[i].dienTich() > max.dienTich()) {
				max = shapes[i];
			}
		}
		System.out.println(max.toString());
	}

	private static void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhap canh a cua tam giac thu " + (i + 1) + ": ");
			double a = sc.nextDouble();
			System.out.println("Nhap canh b cua tam giac thu " + (i + 1) + ": ");
			double b = sc.nextDouble();
			System.out.println("Nhap canh c cua tam giac thu " + (i + 1) + ": ");
			double c = sc.nextDouble();
			shapes[i] = new Triangle(a, b, c);
		}
		
		for(int i = 3; i < 6; i++) {
			System.out.println("Nhap chieu dai cua hinh chu nhat thu " + (i - 2) + ": ");
			double a = sc.nextDouble();
			System.out.println("Nhap chieu rong cua hinh chu nhat thu " + (i - 2) + ": ");
			double b = sc.nextDouble();
			shapes[i] = new Rectangle(a, b);
		}
		
		for (int i = 6; i < 10; i++) {
			System.out.println("Nhap ban kinh cua hinh tron thu " + (i + 1) + ": ");
			double r = sc.nextDouble();
			shapes[i] = new Circle(r);
		}
	}
	
	private static void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		System.out.println("Cac hinh da nhap:");
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}
	}

}
