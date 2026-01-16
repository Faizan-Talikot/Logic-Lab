package core.java.practice.basics;

 class StopWatchTest {
	private boolean running;
	private int ticks;
	public StopWatchTest() {
		this.running = false;
		this.ticks = 0;
	}
	public void start() {
		this.running = true;
	}
	public void stop() {
		this.running = false;
	}
	public void reset() {
		this.ticks = 0;
	}
	public int elapsed() {
		return this.ticks;
	}
	// Controlled way to increment ticks
    public void incrementTick() {
        if (running) {
            ticks++;
        }
    }
	// Helper to check state
    public boolean isRunning() {
        return running;
    }
}	

public class StopWatch {
	

	public static void main(String[] args) {
		StopWatchTest st = new StopWatchTest();
		st.start();
		for(int i=0;i<1000;i++) {
			st.incrementTick();
		}
		st.stop();
		System.out.println("Elapsed ticks: " + st.elapsed()); // Output: 1000

        // 5. Test reset
        st.reset();
        System.out.println("After reset: " + st.elapsed()); // Output: 0
	}

}
