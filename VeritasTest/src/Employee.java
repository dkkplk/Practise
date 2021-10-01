
public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Employee(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {

		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
}
