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
    }
}
