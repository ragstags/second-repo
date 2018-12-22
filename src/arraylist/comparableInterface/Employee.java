package arraylist.comparableInterface;

/**
 * Created by nadimchouglay on 23/04/2018.
 */
public class Employee implements Comparable<Employee> {
    String name;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        Salary = salary;
    }

    String department;
    int Salary;


    @Override
    public int compareTo(Employee o) {
//        if (this.Salary<o.Salary){
//            return -1;
//        }else if(this.Salary>o.Salary){
//            return 1;
//        }

        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
