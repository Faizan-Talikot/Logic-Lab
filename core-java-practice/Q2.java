package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Q1.Employee;

public class Q2 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1,"Faizan","IT",142000),
				new Employee(2,"Amit","HR",150500),
				new Employee(3,"Ayush","HR",50000)
				);
		
//		Map<String, List<Employee>> res = employees.stream()
//								  .collect(Collectors.groupingBy(x -> x.getDept()));
//
//		for(Map.Entry<String, List<Employee>> e : res.entrySet() ) {
//			List<Employee> curr = e.getValue();
//			System.out.print(e.getKey() + " -> ");
//			for(Employee s : curr) {
//				System.out.print(s.getName() + " ");
//			}
//			System.out.println();
//		}
		Map<String, List<String>> res = employees.stream()
										.collect(Collectors.groupingBy(Employee::getDept,
												Collectors.mapping(Employee::getName, Collectors.toList())));
		res.forEach((dept, names) ->
	    System.out.println(dept + " -> " + names)
	    );
	}

}
