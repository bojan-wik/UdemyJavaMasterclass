package section11.scope;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();

//        System.out.println("scopeCheck varOne is " + scopeCheck.getVarOne());
//        System.out.println(varFour);
//
//        scopeCheck.timesTwo();
//

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();

        scopeCheck.useInnerClass();
    }
}
