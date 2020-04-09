package lab6.task1;
import java.util.*;
public class Records {

    private ArrayList<Employee> employees; //Stores the employees

    public Records() {
        employees = new ArrayList();
    }

    public void insert(Employee employee) {
        employees.add(employee);
    }

    public void remove(long emp_num) {
        for(int i = 0; i < employees.size();i++){
            if (employees.get(i).getEmpNum() == emp_num){
                employees.remove(employees.get(i));
                break;
            }
        }
    }

    public boolean isEmployee(long emp_num) {
        for(Employee e:employees){
            if(e.getEmpNum() == emp_num){
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
