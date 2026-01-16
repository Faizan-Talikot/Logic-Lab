package Day4;

class Counter{
	private int value;
	public static int instances = 0;
	Counter(){
		this.value = 0;
		instances++;
	}
	
	public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}

public class Q7_InstanceCounter {

	public static void main(String[] args) {
		Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();
        
        a.increment();
        a.increment();
        b.increment();
        
        System.out.println("Counter A value: " + a.getValue()); // Output: 2
        System.out.println("Counter B value: " + b.getValue()); // Output: 1
        System.out.println("Counter C value: " + c.getValue()); // Output: 0
        
        System.out.println("Total Counter objects created: " + Counter.instances); // Output: 3

	}

}
