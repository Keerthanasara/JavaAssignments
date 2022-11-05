package SalaryPackage;

public class Employee {
	

}
class labour{
	int overtime=2000;
}
class manager{
	
	 int incentive=3000;


public static void main(String[] args) {
	labour salary=new labour();
	int totsalary=100000;
	salary.overtime+=totsalary;
manager salarys=new manager();
salarys.incentive+=totsalary;
System.out.println("labour:"+salary.overtime);
System.out.println("manager:"+salarys.incentive);

}
}