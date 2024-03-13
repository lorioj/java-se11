package jdbc;

import java.util.ArrayList;
import java.util.List;

public class DataController {

	public void executeReader() {

	}

	public List<Employee> findEmployees() {
		List<Employee> l = new ArrayList<>();

		boolean reader = true;
		while (reader) {
			Employee e = new Employee();
			e.setName(""/* rs.getStirng("name") */);
			l.add(e);
		}

		return l;
	}

}
