package section11.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 1; i <= 3; i ++) {
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class InnerClass {
//        private int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar = " + privateVar);
        }

        public void timesTwo() {
//            int privateVar = 2;
            for (int i = 1; i <= 3; i ++) {
                System.out.println(i + " times two is " + i * privateVar);
            }
        }
    }
}
