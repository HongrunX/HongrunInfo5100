package assignment2;

public class Employee {
    private int id;
    private String firstName;
    private static int age;
    private static  double salary;
	public static Object raiseSalary;

    Employee(int id, String firstName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static  double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static double raiseSalary(double byPercent){
		double salary=byPercent*3;
	return salary;
}
}
