package naveenArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nadimchouglay on 28/07/2018.
 */
public class ConceptOfArrayList {
    //dynamic array --ArrayList
    //can contain duplicate values /elements
    //maintains insertion order
    //synchronised
    //allow random access to fetch the ele because it stores val on the basis of indexes
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        ar.add(5);
        ar.add(20);
        ar.add(5);
        ar.add(30);
        ar.add(34);
        ar.add("test");

        System.out.println(ar.size());
        System.out.println(ar.get(2));
        for (int i =0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(100);
        ar1.add(34);

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Nveen",27,"Accout");
        Employee e2 = new Employee("fay",22,"IT");
        Employee e3 = new Employee("Harry",38,"Manager");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employee e:employees){
            System.out.println(e);
        }
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        //********
        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Selenium");
        ar2.add("Test");
        ar2.add("QTP");

        ArrayList<String> ar3 = new ArrayList<>();
        ar3.add("dev");
        ar3.add("java");
        ar3.add("javascript");

        ar3.addAll(ar2);
        ar3.removeAll(ar2);
        for (int i =0;i< ar3.size();i++){
            System.out.println(ar3.get(i));
        }

        ArrayList<String> ar4 = new ArrayList<>();
        ar4.add("hellp");
        ar4.add("pls");
        ar4.add("I");
        ar4.add("stuck");

        ArrayList<String> ar5 = new ArrayList<>();
        ar5.add("stuck");
        ar5.retainAll(ar4);
        for (int i =0;i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }



    }
}
