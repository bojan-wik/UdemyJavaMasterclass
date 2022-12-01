package section16.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Employee wiktor = new Employee("Wiktor", 35);
        Employee mikas = new Employee("Mikas", 32);
        Employee teddy = new Employee("Teddy", 35);
        Employee asia = new Employee("Asia", 32);

        Department it = new Department("IT Department");
        it.addEmployee(wiktor);
        it.addEmployee(mikas);
        it.addEmployee(teddy);

        Department accounting = new Department("Accounting Department");
        accounting.addEmployee(asia);

        List<Department> departments = new ArrayList<>();
        departments.add(it);
        departments.add(accounting);

        // flatmap()

//        departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .forEach(employee -> System.out.println(employee));

        // collect() - to map

//        Map<Integer, List<Employee>> employeesByAge = departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .collect(Collectors.groupingBy(employee -> employee.getAge()));
//
//        System.out.println(employeesByAge);

        // reduce()

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

    }
}
