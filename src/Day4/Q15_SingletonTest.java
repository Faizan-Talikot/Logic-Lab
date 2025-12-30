package Day4;

class SingletonLogger{
	private static SingletonLogger instance;
	private static final String PREFIX =  "[APP] ";
	
	private SingletonLogger() {
		System.out.println("Logger initialized for the first time.");
	}
	
	//Static Factory Method: The only way to get the object
	public static SingletonLogger getInstance() {
		if(instance == null) {
			instance = new SingletonLogger();
		}
		return instance;
	}
	
	public void log(String msg) {
		System.out.println(PREFIX + msg);
	}
}

public class Q15_SingletonTest {

	public static void main(String[] args) {
		SingletonLogger l1 = SingletonLogger.getInstance();
		SingletonLogger l2 = SingletonLogger.getInstance();
		
		// Verification: Compare memory addresses
        System.out.println("Are both references pointing to the same object? " + (l1 == l2));
        
        l1.log("System started.");
        l2.log("Connection established."); // Works on the same object
	}

}
