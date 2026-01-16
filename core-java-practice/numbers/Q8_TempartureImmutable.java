package Day4;

class Temperature{
	private final double celsius;
	public Temperature(double celsius) {
		this.celsius = celsius;
	}
	
	public double toFahrenheit() {
		return (celsius * 9/5) + 32;
	}
	
	public Temperature withCelsius(double c) {
		return new Temperature(c);
	}
	public double getCelsius() {
        return celsius;
    }
}

public class Q8_TempartureImmutable {

	public static void main(String[] args) {
		Temperature t = new Temperature(25.0);
		System.out.println("Original Celsius: " + t.getCelsius());
		System.out.println("Original Fahrenheit: " + t.toFahrenheit()); // Output: 77.0
		
		Temperature t2 = t.withCelsius(30.0);
		System.out.println("\nAfter 'update':");
        System.out.println("t (unchanged): " + t.getCelsius());  // Output: 25.0
        System.out.println("t2 (new object): " + t2.getCelsius()); // Output: 30.0

	}

}
