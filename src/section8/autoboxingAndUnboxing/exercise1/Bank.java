package section8.autoboxingAndUnboxing.exercise1;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        branchList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public boolean addBranch(String branchName){
        for (Branch branch : branchList) {
            if (branch.getBranchName().equals(branchName)) {
                System.out.println("Error: The branch '" + branchName + "' has already been added before.");
                return false;
            }
        }
        Branch newBranch = new Branch(branchName);
        branchList.add(newBranch);
        System.out.println("The branch '" + branchName + "' added successfully.");
        return true;
    }
}
