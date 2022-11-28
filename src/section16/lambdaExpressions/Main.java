package section16.lambdaExpressions;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // test data
        Employee wiktor = new Employee("Wiktor", 35);
        Employee mikas = new Employee("Mikas", 32);
        Employee teddy = new Employee("Teddy", 36);
        Employee asia = new Employee("Asia", 34);

        List<Employee> employees = Arrays.asList(wiktor, mikas, teddy, asia);

        /*
        - sort the employees by name in ASC order
        - print the results
         */

        // WITHOUT lambda expressions

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        // WITH lambda expressions

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        //

//        String upperAndConcatEmployeeName = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String string1, String string2) {
//                return string1.toUpperCase() + string2.toUpperCase();
//            }
//        },
//        employees.get(0).getName(), employees.get(3).getName());

        //

        UpperConcat upperConcat = (string1, string2) -> string1.toUpperCase() + string2.toUpperCase();
        String upperAndConcatEmployeeName = doStringStuff(upperConcat,
                employees.get(0).getName(), employees.get(3).getName());

        System.out.println(upperAndConcatEmployeeName);
    }

    public final static String doStringStuff(UpperConcat uc, String string1, String string2) {
        return uc.upperAndConcat(string1, string2);
    }
}
