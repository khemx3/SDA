package lab6.task1;
import java.util.Vector;
public class Database {

    private Vector<Employee> employees; //Stores the employees

    public Database() {
        employees = new Vector();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        for(Employee e:employees){
            if (e.getEmpNum() == emp_num){
                employees.remove(e);
                break;
            }
        }
    }
    public  boolean isEmployee(long emp_num) {
        for(Employee e:employees){
            if (e.getEmpNum() == emp_num){
                return true;
            }
        }
        return false;
    }

    public void listAllEmployee(){
        for (Employee e:employees){
            System.out.println(e.toString());
        }
    }

}
