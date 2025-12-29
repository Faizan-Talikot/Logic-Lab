package Day4;

class RectangleImplementation{
	private double height;
	private double width;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height>0) this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0) this.width = width;
	}
	// Method to calculate area
    public double area() {
        return width * height;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (width + height);
    }
	
}

public class Q2_Rectangle {

	public static void main(String[] args) {
		RectangleImplementation r = new RectangleImplementation();
		// Standard setup
        r.setWidth(10);
        r.setHeight(5);
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.area());         // Expected: 50.0
        System.out.println("Perimeter: " + r.perimeter()); // Expected: 30.0
	}

}
