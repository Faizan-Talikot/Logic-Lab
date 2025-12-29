package Day4;

public class Q9_AccessTest {

	public static void main(String[] args) {
		Q9_AccessDemo demo = new Q9_AccessDemo();
		
		// 1. Public: Works
        demo.publicMethod();

        // 2. Protected: Works because we are in the same package
        demo.protectedMethod();

        // 3. Default: Works because we are in the same package
        demo.defaultMethod();

        /* * 4. Private: WILL NOT COMPILE
         * Error: The method privateMethod() from the type AccessDemo is not visible
         */
//         demo.privateMethod(); 
//        demo.callPrivateInternally(); helper method to call private method
        
        System.out.println("\nObservation: Public, Protected, and Default are callable from the same package.");
    }
}


