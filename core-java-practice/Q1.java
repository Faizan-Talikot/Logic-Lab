package Q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1,"Faizan","IT",142000),
				new Employee(2,"Amit","HR",150500),
				new Employee(3,"Ayush","HR",50000)
				);
		
		List<String> names = employees.stream()
							          .filter(e -> e.getSalary() > 50000)
							          .map(e -> e.getName().toUpperCase())
							          .collect(Collectors.toList());
		
		for(String s : names) {
			System.out.println(s);
		}

	}

}
