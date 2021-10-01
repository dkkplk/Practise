import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeSample {

	public static void main(String[] args) {

		Employee e1 = new Employee("Raj");
		Employee e2 = new Employee("saz");
		Employee e3 = new Employee("Gel");
		Employee e4 = new Employee("pan");

		Map<Employee, String> store = new HashMap<>();

		store.put(e1, "1");
		store.put(e2, "2");
		store.put(e3, "3");
		store.put(e4, "4");

		for (Entry<Employee, String> s : store.entrySet()) {
			System.out.println(s.getKey().getName());
			System.out.println(s.getValue());
		}
		
		
		Set<Employee> set = new HashSet<>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(set);
		
	}

}
