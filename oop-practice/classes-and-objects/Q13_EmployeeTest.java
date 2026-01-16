package Day4;

class Employee {
    private String name;
    private double salary;

    // Setter for Name with non-empty validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid name. Cannot be empty.");
        }
    }

    // Setter for Salary with range validation
    public void setSalary(double s) {
        if (s >= 10000 && s <= 500000) {
            this.salary = s;
        } else {
            System.out.println("Error: Invalid salary. Must be between 10,000 and 500,000.");
        }
    }

    public void raise(double percent) {
        if (percent >= 0 && percent <= 100) {
            double increase = (percent / 100) * salary;
            this.salary += increase;
            System.out.println("Raise applied. New salary: " + salary);
        } else {
            System.out.println("Error: Invalid raise percentage. Must be 0-100.");
        }
    }

    // Getters for read access
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class Q13_EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee();

        // 1. Test Name Validation
        e.setName(""); // Output: Error message
        e.setName("Faizan");

        // 2. Test Salary Validation
        e.setSalary(9000);   // Output: Error message (too low)
        e.setSalary(120000); // Success

        // 3. Test Raise Logic
        e.raise(10);  // 120,000 + 12,000 = 132,000
        e.raise(200); // Output: Error message (invalid percentage)

        System.out.println("\nFinal Record:");
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

	}

}
