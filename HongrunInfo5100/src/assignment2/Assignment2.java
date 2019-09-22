package assignment2;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(double employees) {
        // @TODO
    	Employee[] arr=new Employee[10];
    	for(int i=1; i<arr.length;i++){
    		if(Employee.getSalary()>5000){
    			return employees;
    		}
    	}
        return 0.0;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
        // @TODO
    	Employee[] arr=new Employee[10];
    	for(int i=1; i<arr.length;i++){
    		boolean divisibleBy3=(employee.getId()%3==0);
    		boolean divisibleBy5=(employee.getId()%5==0);
    		
    		if (divisibleBy3 && divisibleBy5) {
    	        System.out.println(employee.getId()+"is Fizzbuzz");
    	}else if(divisibleBy3){
    		System.out.println(employee.getId()+"is Fizz");
    	}else if(divisibleBy5){
    		System.out.println(employee.getId()+"is Buzz");
    	}else{
    		throw new IllegalArgumentException();
    	}
    	}
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        // @TODO
    	double tax=0;
    	Employee[] arr=new Employee[10];
    	for(int i=0;i<arr.length;i++){
    		if(Employee.getSalary()<=2500){
    			tax=0.1;
    		}else if(Employee.getSalary()>2500&&Employee.getSalary()<=5000){
    			tax=0.25;
    		}else{
    			tax=0.35;
    		}
    	}
        return 0.0;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        // @TODO
    	swap(firstEmployee,secondEmployee);
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
    	int index=0;
    	Employee[] arr=new Employee[10];
    	for(int i=1; i<arr.length;i++){
    		if(Employee.getAge()>50){
    			index++;
    		}
    		return index;
    	}
        return 0;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public String reverseFirstName(int employee) {
        // @TODO
    	   return new StringBuffer(employee).reverse().toString();
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public boolean isContainDigit(Employee employee) {
        // @TODO
    	for (int i =((CharSequence) employee).length(); --i >= 0;) {
            if (!Character.isDigit(((CharSequence) employee).charAt(i))) {
                return false;
            }
        }
        return true;
    }

    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(double employee) {
        // @TODO
    	Employee.raiseSalary(employee);
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
    	String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        Employee[] employees1 = new Employee[employeesStr.length];        
        // @TODO
        return employees1;
    }
}
