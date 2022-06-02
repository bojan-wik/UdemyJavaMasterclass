package section8.linkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Wiktor", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.printf("Balance for customer %s is %f\n", customer.getName(), customer.getBalance()).println();

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i ++) {
            System.out.printf("%d: %d\n", i, intList.get(i));
        }
        System.out.println();

        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i ++) {
            System.out.printf("%d: %d\n", i, intList.get(i));
        }
    }
}
