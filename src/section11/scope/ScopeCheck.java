package section11.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 1; i <= 3; i ++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from inner class = " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne = " + varOne + ", varThree = " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here, varOne = " + varOne);
            for (int i = 1; i <= 3; i ++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
