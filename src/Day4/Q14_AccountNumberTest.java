package Day4;

class AccountNumber{
	private final String digits;
	private static final String DEFAULT_ACC = "000000000000";
	AccountNumber(String s){
		if(isValid(s)) {
			this.digits = s;
		}
		else {
			System.out.println("Invalid account number: Using default.");
            this.digits = DEFAULT_ACC;
		}
	}
	
	public static boolean isValid(String s) {
		if(s == null || s.length() !=12) return false;
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public String getDigits() {
        return digits;
    }

    @Override
    public String toString() {
        return digits;
    }
}

public class Q14_AccountNumberTest {

	public static void main(String[] args) {
		AccountNumber a = new AccountNumber("123456789012");
        System.out.println("Account A: " + a);

        // 2. Invalid case (too short)
        AccountNumber b = new AccountNumber("ABC"); 
        System.out.println("Account B: " + b);

        // 3. Testing the static method directly
        boolean check = AccountNumber.isValid("999888777666");
        System.out.println("Is 999888777666 valid? " + check);

	}

}
