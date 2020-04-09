package lab6.task1;

public class Employee {
    private String name;
    private String surname;
    private long emp_num;
    private double salary;
    public Employee(String name, String surname, long emp_num, double salary) {
        this.name = name;
        this.surname = surname;
        this.emp_num = emp_num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
 
    public String getSurname() {
        return surname;
    }

    public long getEmpNum() {
        return emp_num;
    }
  
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emp_num=" + emp_num +
                ", salary=" + salary +
                '}';
    }
}
