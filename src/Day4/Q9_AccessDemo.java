package Day4;

public class Q9_AccessDemo {

	
		public void publicMethod() {
	        System.out.println("Public: I am accessible from everywhere.");
	    }

	    protected void protectedMethod() {
	        System.out.println("Protected: I am accessible in the same package and by subclasses.");
	    }

	    // Default (Package-Private) - no keyword used
	    void defaultMethod() {
	        System.out.println("Default: I am accessible only in the same package.");
	    }

	    private void privateMethod() {
	        System.out.println("Private: I am accessible only within this class.");
	    }

	    // This internal method can call the private method
	    public void callPrivateInternally() {
	        privateMethod();
	    }

	

}
