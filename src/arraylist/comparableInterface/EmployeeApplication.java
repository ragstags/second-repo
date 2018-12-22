package arraylist.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nadimchouglay on 23/04/2018.
 */
public class EmployeeApplication {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Mike","Accounts",1200));
        hashSet.add(new Employee("Jess","IT",35000));
        hashSet.add(new Employee("Fay","Acc",1276));
        ArrayList<Employee> mylist = new ArrayList<>(hashSet);
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}
