package Day4;

class Config{
	public static final String APP_NAME = "LogicLab";
	public static final String VERSION = "1.0.4";
    public static final int MAX_USERS = 500;
}

public class Q5_Config {

	public static void main(String[] args) {
		System.out.println("Application: " + Config.APP_NAME);
        System.out.println("Version: " + Config.VERSION);
        System.out.println("User Limit: " + Config.MAX_USERS);

	}

}
