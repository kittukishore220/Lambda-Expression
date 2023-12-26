package interview;

final class Employee {
final private int i;
Employee(int i){
	this.i=i;
}
public Employee get(int i) {
	if(this.i==i) {
		return this;
	}else {
		Employee e=new Employee(i);
		return e;
	}
}
public static void main(String[] args) {
	Employee E=new Employee(10);
	Employee employee = E.get(10);
}
}
