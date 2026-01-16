package core.java.practice.basics;

class IdGenerator{
	private static int next = 1000;
	public static int nextID() {
		return next++;
	}
}

class User{
	private final String name;
	private final int id;
	User(String name){
		this.name = name;
		this.id = IdGenerator.nextID();
	}
	public int getId() {
		return this.id;
	}
}

public class IdGenerator {

	public static void main(String[] args) {
		User u1 = new User("A");
		User u2 = new User("B");
		System.out.println(u1.getId()); // 1000
		System.out.println(u2.getId()); // 1001

	}

}
