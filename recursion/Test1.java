package recursion;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Hello");
		Employee e2=new Employee();
		e1.setId(1);
		e1.setName("Hello");
		
		Map<Employee,Integer>map=new HashMap<>();
		map.put(e1, 1);
		map.put(e1, 1);
		map.put(e2, 3);
		System.out.println(map.size());

	}

}
