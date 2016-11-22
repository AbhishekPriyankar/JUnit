import java.util.HashMap;
import java.util.*;

public class HashMapClass {
	private HashMap<String, Integer> employee = new HashMap<String, Integer>();
	public Set set = employee.entrySet();
	public Iterator i = set.iterator();
	
	public HashMapClass() {

	}

	public HashMapClass(HashMap<String, Integer> employee) {
		super();
		this.employee = employee;
	}

	public HashMap<String, Integer> getEmployeeList() {
		return employee;
	}

	public void setEmployeeList(HashMap<String, Integer> employee) {
		this.employee = employee;
	}

	public void setEmp(String name, int id) {
		employee.put(name, id);
	}

	public void printList() {
		while (i.hasNext()) {
			Map.Entry emp = (Map.Entry) i.next();
			System.out.println("Key : " + emp.getKey() + "\t  Value : " + emp.getValue());
		}
	}
	public Object findByValue(HashMap hm , int empId){
		for(Object name : hm.keySet()){
			if(hm.get(name).equals(empId))
				return name;
		}
		return null;
	}
	
	public static void main(String args[]) {
		HashMapClass empList = new HashMapClass();
		empList.setEmp("Abhi", 109);
		empList.setEmp("Shivam", 101);
		empList.setEmp("Priyankar", 105);
		empList.setEmp("Vishal", 103);
		empList.printList();
		
		HashMap<String, Integer> arr = new HashMap<String , Integer>();
		
		System.out.println("The Value is : "+findByValue(empList, 105));
	}
}
