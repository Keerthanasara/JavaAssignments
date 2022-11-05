import java.util.Collection;
import java.util.HashSet;

public class EmployeeObjects {
public static void main(String[] args) {
	
	
	HashSet<Employee> obj=new HashSet<Employee>();
	Employee emp1=new Employee(101,"keerthi",70000.00,"IT");
	Employee emp2=new Employee(102,"parthi",90000.00,"cs");
	Employee emp3=new Employee(103,"devi",50000.00,"IT");
	Employee emp4=new Employee(104,"lakshmi",20000.00,"cs");
	Employee emp5=new Employee(105,"nandhini",40000.00,"IT");
	obj.add(emp1);
	obj.add(emp2);
	obj.add(emp3);
	obj.add(emp4);
	obj.add(emp5);

	for(Employee Details:obj) {
		System.out.println(Details);
	}
}
}
