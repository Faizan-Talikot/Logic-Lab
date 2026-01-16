package Day4;

 class Vector2D {
    // Immutable fields
    private final double x;
    private final double y;

    // Public static final constants
    public static final Vector2D ZERO = new Vector2D(0, 0);
    public static final Vector2D UNIT_X = new Vector2D(1, 0);
    public static final Vector2D UNIT_Y = new Vector2D(0, 1);

    // Private constructor to enforce use of factories or internal instantiation
    private Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Static Factory Method
    public static Vector2D fromPolar(double r, double theta) {
        // x = r * cos(theta), y = r * sin(theta)
        return new Vector2D(r * Math.cos(theta), r * Math.sin(theta));
    }

    // Instance methods - returns NEW objects to maintain immutability
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    public Vector2D scale(double s) {
        return new Vector2D(this.x * s, this.y * s);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
}

public class Q12_VectorTest {

	public static void main(String[] args) {
		// 1. Using Static Factory
        Vector2D v = Vector2D.fromPolar(2, Math.PI / 2); 
        System.out.println("Vector v: " + v);

        // 2. Using Constants and Addition
        Vector2D w = Vector2D.UNIT_X.add(v); 
        System.out.println("Vector w (UNIT_X + v): " + w);

        // 3. Scaling
        Vector2D scaled = w.scale(2); // (2, 4)
        System.out.println("Scaled w by 2: " + scaled);

        // 4. Magnitude
        System.out.printf("Magnitude of scaled: %.2f\n", scaled.magnitude());

	}

}
