package advance.dev;

public class Rectangle extends Shape{
	
	private double a;
	private double b;
	
	
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (a + b);
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return a * b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh chu nhat [a = " +  a + ", b = "+ b + "]";
	}

}
