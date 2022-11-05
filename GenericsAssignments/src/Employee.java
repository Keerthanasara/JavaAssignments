
public class Employee implements Comparable<Employee> {
Integer id;
String name;
double salary;
String dept;
public Employee(int id, String name, double salary, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
public Integer getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String toString() {
	return "Employee[id="+id+",name="+name+",salary="+salary+",dept="+dept+"]";
}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.getId().compareTo(o.getId());
}
}
