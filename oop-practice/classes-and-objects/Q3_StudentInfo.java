package Day4;

class Student{
	final int id;
	private String name;
	
	public Student(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return this.id;
	}
}

public class Q3_StudentInfo {

	public static void main(String[] args) {
		Student s = new Student(101);

        s.setName("Alice");
        System.out.println("Student Name: " + s.getName());

        System.out.println("Student ID: " + s.getID());

        System.out.println("Note: ID " + s.getID() + " is locked and cannot be changed.");

	}

}
